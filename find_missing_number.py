# You can access and solve this problem at https://www.online-python.com/5sk1GigJcA
#
#
# You have a list of numbers from 1 to N, but one number is missing. Find the missing number.
# Example:
# Input: [1, 2, 4, 5, 6]
# Output: 3

# Input: [1, 2, 3, 4, 5, 7, 8, 9, 10]
# Output: 6
# The Challenge:
# Write a function that finds the missing number.

# WARNING                                                                WARNING #
# WARNING: A slow solution might take a YEAR to solve the hard example.  WARNING #
# WARNING                                                                WARNING #

import time 

easy_example = [0,1,2,3,4,5,6,7,8,10,11]
medium_example = list(range(50000))[:40000] + list(range(50000))[40001:]
hard_example = list(range(1000000))[:900000] + list(range(1000000))[900001:]
            
def find_missing(nums: list[int]) -> int:
    ### YOUR CODE HERE ####
    print("YOU DIDNT WRITE ANY CODE YET!!!!")


# Uncomment to run examples

# Easy Example
# start = time.time()
# print(find_missing(easy_example))
# print("Time to complete easy example: ", time.time()-start)

# Medium Example
# start = time.time()
# print(find_missing(medium_example))
# print("Time to complete medium example: ", time.time()-start)

# Hard Example
# start = time.time()
# print(find_missing(hard_example))
# print("Time to complete hard example: ", time.time()-start)
