package Assignment20

def str1 = "listen"
def str2 = "silent"

if (str1.length() != str2.length()) {
    println("Are anagrams? false")
} else {
    def count1 = new int[26]
    def count2 = new int[26]

    for (int i = 0; i < str1.length(); i++) {
        count1[str1.charAt(i) - 'a']++
        count2[str2.charAt(i) - 'a']++
    }

    def isAnagram = true
    for (int i = 0; i < 26; i++) {
        if (count1[i] != count2[i]) {
            isAnagram = false
            break
        }
    }

    println("Are anagrams? $isAnagram")
}

