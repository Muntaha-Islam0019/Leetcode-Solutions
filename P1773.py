from typing import List


class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:

        counter = 0

        for item in items:
            print(item)
            print(ruleKey)
            print(ruleValue)
            if ruleKey in item and ruleValue in item:
                print("Found one!")
                counter += 1

        return counter


obj = Solution()
print(obj.countMatches(
    [["phone","blue","pixel"],
    ["computer","silver","lenovo"],
    ["phone","gold","iphone"]],
    "color",
    "silver"))
