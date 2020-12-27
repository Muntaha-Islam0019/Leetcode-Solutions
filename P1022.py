# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
 
mod=1000000007
class Solution:
    def dfs(self,root,cur,ans):
        if None==root.left and None==root.right:
            ans+=cur
            ans%=mod
        if root.left:
        	ans=self.dfs(root.left,(cur*2+root.left.val)%mod,ans)
        if root.right:
        	ans=self.dfs(root.right,(cur*2+root.right.val)%mod,ans)
        return ans
 
    def sumRootToLeaf(self, root: TreeNode) -> int:
        ans=0
        ans=self.dfs(root,root.val,ans)
        return ans