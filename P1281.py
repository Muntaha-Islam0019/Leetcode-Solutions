import math

class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        
        digits = list()
        while n != 0:
            digits.append(n % 10)
            n = int(n / 10)

        mult = math.prod(digits)
        summ = sum(digits)

        answer = mult - summ
        print(answer, mult, summ, digits)

        return answer

# obj = Solution()
# obj.subtractProductAndSum(705)
