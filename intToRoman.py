romanConversions = {
    "I": 1,
    "V": 5,
    "X": 10,
    "L": 50,
    "C": 100,
    "D": 500,
    "M": 1000,
}


class Solution:
    def romanToInt(self, s: str) -> int:
        total = 0
        i = 0
        while i < len(s):
            if i + 1 < len(s) and romanConversions[s[i]] < romanConversions[s[i + 1]]:
                total += romanConversions[s[i + 1]] - romanConversions[s[i]]
                i += 2

            else:
                total += romanConversions[s[i]]
                i += 1

        return total