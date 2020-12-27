class Solution:
    def reverseWords(self, s):

        # As join doesnt add the added value (here space) to the first iteration
        return ' '.join([word[::-1] for word in s.split(' ')])


# obj = Solution()
# print(obj.reverseWords("Let's take LeetCode contest"))
