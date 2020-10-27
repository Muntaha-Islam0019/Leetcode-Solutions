class Solution:
    def freqAlphabets(self, s):

        answer = ""

        i = 0
        length = len(s)
        while i < length:
            if i + 2 < length and s[i + 2] == '#':
                answer += chr(int(s[i:i+2]) + 96)
                i += 3
            else:
                answer += chr(int(s[i]) + 96)
                i += 1

        return answer
