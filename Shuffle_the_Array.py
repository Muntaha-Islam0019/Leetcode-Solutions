class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:

        x_nums = nums[:n]
        y_nums = nums[n:]

        new_list = list()

        for index in range(n):
            new_list.append(x_nums[index])
            new_list.append(y_nums[index])

        return new_list
