class Solution:
    def flipAndInvertImage(self, A):
        
        rows = len(A)
        cols = len(A[0])
        
        for row in range(rows):
            
            A[row] = A[row][::-1]
            
            for col in range(cols):
                A[row][col] ^= 1
                
        return A