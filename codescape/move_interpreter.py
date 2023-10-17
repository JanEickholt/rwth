def interpret(moves):
    # viewing position 0 = North, 1 = East, 2 = South, 3 = West
    view = 1

    # string to be printed, containing rotations
    move_str = ""

    for i in moves:
        if i == "r":
            while view != 1:
                move_str += "r"
                view = (view + 1) % 4
            move_str += "m"
        elif i == "l":
            while view != 3:
                move_str += "r"
                view = (view + 1) % 4
            move_str += "m"
        elif i == "u":
            while view != 0:
                move_str += "r"
                view = (view + 1) % 4
            move_str += "m"
        elif i == "d":
            while view != 2:
                move_str += "r"
                view = (view + 1) % 4
            move_str += "m"
        elif i == "p":
            move_str += "p"
        elif i == "R":
            while view != 0:
                move_str += "r"
                view = (view + 1) % 4
            move_str += "R"
        elif i == "W":
            while view != 0:
                move_str += "r"
                view = (view + 1) % 4
            move_str += "W"

    return move_str


if __name__ == "__main__":
    move= "rupddrruurrddpurr"
    print(interpret(move))