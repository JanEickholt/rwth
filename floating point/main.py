def main(number: float, float_precision: int = 23, bias: int = 127):
    sign: int = 1 if number < 0 else 0
    int_number: int = int(number) if not sign else int(number) * -1
    float_number: float = number - int_number if not sign else (number - int_number * -1) * -1
    float_number_str: str = ""

    bin_int_number: str = format(int_number, 'b')

    float_number_copy: float = float_number
    for i in range(0, float_precision):
        float_number_copy *= 2
        # print(round(float_number_copy, 5))
        if float_number_copy >= 1:
            float_number_str += '1'
            float_number_copy -= 1
        else:
            float_number_str += '0'

    print(f"{int_number}: {bin_int_number}\n"
          f"{round(float_number, 5)}: {float_number_str}")

    move_decimal_points: int = len(bin_int_number) - 1
    bias_for_float: int = bias + move_decimal_points
    bias_for_float_bin: str = format(bias_for_float, 'b')

    float_number_str = (bin_int_number[1:] + float_number_str)[:float_precision]

    print()
    print(f"move point to left {move_decimal_points} times, 2^{move_decimal_points}")
    print(f"exponent = {bias} + {move_decimal_points}")
    print(f"exponent {bias_for_float}: {bias_for_float_bin}")

    print()
    print(f"S {'E' * len(bias_for_float_bin)} {'M' * float_precision}")
    print(f"{sign} {bias_for_float_bin} {float_number_str}")


if __name__ == '__main__':
    main(0.15625)
