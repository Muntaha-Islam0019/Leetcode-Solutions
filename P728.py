class Solution:
    def selfDividingNumbers(self, left, right):

        return [num for num in range(left, right+1)
                if '0' not in str(num) and all(num % int(c) == 0 for c in str(num))]
