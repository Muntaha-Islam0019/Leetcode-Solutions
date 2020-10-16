class Solution:
    def uniqueMorseRepresentations(self, words):

        morse = [".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                 "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."]
        english = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                   'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
        edict = dict(zip(english, morse))
        res = set()
        for word in words:
            mword = ""
            for char in word:
                mword = mword + edict[char]
            res.add(mword)
        return len(res)
