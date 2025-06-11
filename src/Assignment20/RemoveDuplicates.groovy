package Assignment20

def list = [1, 2, 2, 3, 4, 4, 5]
def result = []

for (element in list) {
    def found = false
    for (item in result) {
        if (item == element) {
            found = true
            break
        }
    }
    if (!found) {
        result.add(element)
    }
}

println("Output: $result")


