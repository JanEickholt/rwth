moves = "mmmmplmmmlllm"

available_moves = {
    "m": "move();",
    "r": "turnRight();",
    "l": "turnLeft();",
    "p": "pickUp();"
}

move_dict = {}
for idx, move in enumerate(moves):
    idx = str(idx)
    if move not in move_dict:
        move_dict[move] = [idx]
    else:
        move_dict[move].append(idx)

move_dict.pop("m")

print(f"        for(int i = 0; i < {len(moves)}; i++) {'{'}")
print(f"            switch(i) {'{'}")

for k in move_dict:
    print(f"""                case {": case ".join(move_dict[k])}: {'{\n                    '}{available_moves[k]}{'\n                    break;\n                }'}""")

print("                default: move();")
print("            }")
print("        }")
