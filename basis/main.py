import string

digits = string.digits + string.ascii_uppercase


def convert_base(num, to_base=10, from_base=10):
    if isinstance(num, str):
        n = int(num, from_base)
    else:
        n = int(num)
    if n < to_base:
        return digits[n]
    else:
        return convert_base(n // to_base, to_base) + digits[n % to_base]


print(convert_base("00100010", 8, 2))
