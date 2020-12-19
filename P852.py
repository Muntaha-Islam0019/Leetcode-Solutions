from typing import List


class Solution:
    def peakIndexInMountainArray(self, A: List[int]) -> int:
        start, end = 0, len(A)
        while start < end:
            mid = int((start+end)/2)
            if A[mid-1] < A[mid] and A[mid] > A[mid+1]:
                return mid
            elif A[mid+1] > A[mid]:
                start = mid+1
            elif A[mid-1] > A[mid]:
                end = mid
