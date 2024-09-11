def count_ways_recursive(arr, target, N, index):
    # Base case: If the target is 0, there's exactly one way to achieve it (by using no elements).
    if target == 0:
        return 1
    # Base case: If the target is less than 0 or no elements are left, no valid combination exists.
    if target < 0 or index == len(arr):
        return 0

    # Initialize the number of ways
    ways = 0

    # Try using the current element (arr[index]) from 0 up to N times
    for count in range(N + 1):
        # Calculate the new target after using the current element count times
        new_target = target - arr[index] * count
        print(new_target)
        # Recursively count the ways for the new target with the remaining elements
        ways += count_ways_recursive(arr, new_target, N, index + 1)

    return ways

def count_ways(arr, target, N):
    # Start recursion with the full array, target, and max repetitions N
    return count_ways_recursive(arr, target, N, 0)

# Example usage
N = 3
arr = [2, 4, 10]
target = 10
output = count_ways(arr, target, N)
print(output)  # Output: 7


# def count_ways(arr, target, N):
#     # Create a 2D DP array where dp[i][j] represents the number of ways to make sum j using 
#     # elements from the first i items of the array, each up to N times.
#     dp = [[0] * (target + 1) for _ in range(len(arr) + 1)]
#     dp[0][0] = 1  # One way to make sum 0 with 0 items (using nothing)
    
#     # Iterate over items
#     for i in range(1, len(arr) + 1):
#         num = arr[i - 1]
#         for j in range(target + 1):
#             # Copy the value from the previous row (not using the current item)
#             dp[i][j] = dp[i - 1][j]
#             # Now add ways by using current item 1 to N times if possible
#             for k in range(1, N + 1):
#                 if j >= k * num:
#                     dp[i][j] += dp[i - 1][j - k * num]
#                 else:
#                     break  # No point in checking further if the sum goes negative
    
#     return dp[len(arr)][target]

# # Example usage
# N = 5
# arr = [100, 200, 500]
# target = 1000
# output = count_ways(arr, target, N)
# print(output)  # Output: 7
