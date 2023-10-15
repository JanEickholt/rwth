def main(num: str):
    if num[0] == "0":
        print("Positive Zahlen werden nicht invertiert")
        print(f"Zahl: {num}, {int(num, 2)}")
        print(f"Einerkomplement: {num}")
        print(f"Zweierkomplement: {num}")
        return

    bin_value: int = int(num, 2)

    value_to_invert = int(len(num) * "1", 2)
    inverted_value: int = value_to_invert ^ bin_value
    inverted_value_plus_1: int = inverted_value + 1

    print(f"Zahl: {num}, -{int(format(bin_value, 'b')[1:], 2)}")
    print(f"Einerkomplement: {format(inverted_value, 'b')}")
    print(f"Zweierkomplement: {format(inverted_value_plus_1, 'b')}")


if __name__ == '__main__':
    number: str = "10000101"
    main(number)
