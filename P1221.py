class Solution:
    def balancedStringSplit(self, s: str) -> int:
        
        balance = 0
        answer = 0

        for character in s:
            balance += 1 if character == 'L' else -1
            if balance == 0:
                answer += 1
        
        return answer
