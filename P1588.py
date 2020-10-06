class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        
        answer = 0

        for i in range(len(arr)):
            answer += int(((i + 1) * (len(arr) - i) + 1) / 2) * arr[i]

        return answer
