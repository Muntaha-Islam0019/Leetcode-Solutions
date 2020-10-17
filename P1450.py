class Solution:
    def busyStudent(self, startTime: List[int], endTime: List[int], queryTime: int) -> int:
        
        result = 0

        for i in startTime:
            if i <= queryTime:
                result += 1

        for j in endTime:
            if j < queryTime:
                result -= 1

        return result
