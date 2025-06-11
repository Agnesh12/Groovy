package Assignment20

def n = 10
def a = 0
def b = 1

print("Fibonacci Series: ")

for (int i = 0; i < n; i++) {
    print("${a} ")
    def next = a + b
    a = b
    b = next
}
println()

