class Solution:
    def countNegatives(self, grid):
        i = [item for row in grid for item in row]
        return len([j for j in i if j<0])