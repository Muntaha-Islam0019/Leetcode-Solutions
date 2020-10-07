# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:

        res = 0

        while head:
            res = res * 2 + head.val
            head = head.next

        return res


# A faster solution:
# class Solution:
#     def getDecimalValue(self, head: ListNode) -> int:
#         num = head.val
#         while head.next:
#             num = (num << 1) | head.next.val
#             head = head.next
#         return num
