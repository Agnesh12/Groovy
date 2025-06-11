package Assignment20

def input = "madam"
def isPalindrome = true
int len = input.length()

for (int i = 0; i < len / 2; i++) {
    if (input.charAt(i) != input.charAt(len - i - 1)) {
        isPalindrome = false
        break
    }
}

println("Is palindrome? $isPalindrome")

