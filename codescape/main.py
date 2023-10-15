"""
converts steps.txt to a list of steps
instructions: left, right, pick, write {variable/"text"}, read {variable}
"""

with open("steps.txt") as f:
    steps = f.readlines()
    instructions = {}

    for idx, step in enumerate(steps):
        step = step.strip()
        if step == "left":
            step = "turnLeft();"
        elif step == "right":
            step = "turnRight();"
        elif step == "pick":
            step = "pickUp();"
        elif "write" in step:
            step = 'write(' + step.split(" ")[1] + ');'
        elif "read" in step:
            print(f"""String {step.split(' ')[1]} = ""; """)
            step = f'{step.split(" ")[1]} = read();'
        else:
            step += "();"
        if step not in instructions:
            instructions[step] = []

        instructions[step].append(idx)


# Convert constructions to java if conditions
for step in instructions:
    instructions[step] = "    if (i == {}) {{\n\t    {}\n    }}".format(
        " || i == ".join(map(str, instructions[step])), step)

print(f"for (int i = 0; i < {len(steps)}; i++) {{")
print("\n".join(instructions.values()))
print("}")



