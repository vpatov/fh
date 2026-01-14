# You can solve the problem here: https://www.online-python.com/fwK2OqrVNh
#
#
# MULTI-PART PATTERN CHALLENGE
# Complete all three functions below to create different patterns

# WARNING: Make sure your solutions work efficiently for large inputs!

import time

# ============================================================================
# PART 1: Print Numbers 1 to N
# ============================================================================
# Print all integers from 1 to N, each on its own line
# Example:
# print_numbers(5) should output:
# 1
# 2
# 3
# 4
# 5

def print_numbers(n: int) -> None:
    ### YOUR CODE HERE ###
    pass


# ============================================================================
# PART 2: ASCII Box
# ============================================================================
# Create a square box using asterisks (*) with side length n
# Example:
# print_box(5) should output:
# *****
# *   *
# *   *
# *   *
# *****

def print_box(n: int) -> None:
    ### YOUR CODE HERE ###
    pass


# ============================================================================
# PART 3: Number Spiral
# ============================================================================
# Create a spiral pattern that goes: right → down → left → up → right...
# The spiral should contain numbers 1 through n*n
# 
# Example:
# print_spiral(3) should output:
# 1 2 3
# 8 9 4
# 7 6 5
#
# Example:
# print_spiral(4) should output:
#  1  2  3  4
# 12 13 14  5
# 11 16 15  6
# 10  9  8  7
#
# Hint: Think about going right, then down, then left, then up, repeat!

def print_spiral(n: int) -> None:
    ### YOUR CODE HERE ###
    pass


# ============================================================================
# TEST YOUR SOLUTIONS
# ============================================================================

print("=" * 50)
print("PART 1: Numbers 1 to 10")
print("=" * 50)
print_numbers(10)

print("\n" + "=" * 50)
print("PART 2: Box with side length 7")
print("=" * 50)
print_box(7)

print("\n" + "=" * 50)
print("PART 3: Spiral 5x5")
print("=" * 50)
print_spiral(5)

print("\n" + "=" * 50)
print("BONUS: Large Spiral 10x10")
print("=" * 50)
print_spiral(10)


# **Expected Output:**
# ```
# ==================================================
# PART 1: Numbers 1 to 10
# ==================================================
# 1
# 2
# 3
# 4
# 5
# 6
# 7
# 8
# 9
# 10

# ==================================================
# PART 2: Box with side length 7
# ==================================================
# *******
# *     *
# *     *
# *     *
# *     *
# *     *
# *******

# ==================================================
# PART 3: Spiral 5x5
# ==================================================
#  1  2  3  4  5
# 16 17 18 19  6
# 15 24 25 20  7
# 14 23 22 21  8
# 13 12 11 10  9

# ==================================================
# BONUS: Large Spiral 10x10
# ==================================================
#  1  2  3  4  5  6  7  8  9 10
# 36 37 38 39 40 41 42 43 44 11
# 35 64 65 66 67 68 69 70 45 12
# 34 63 84 85 86 87 88 71 46 13
# 33 62 83 96 97 98 89 72 47 14
# 32 61 82 95100 99 90 73 48 15
# 31 60 81 94 93 92 91 74 49 16
# 30 59 80 79 78 77 76 75 50 17
# 29 58 57 56 55 54 53 52 51 18
# 28 27 26 25 24 23 22 21 20 19
