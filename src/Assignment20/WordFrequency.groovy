package Assignment20

print "Enter a sentence: "
def input = System.console()?.readLine() ?: "hello world hello"

def words = input.tokenize(" ")
def frequencyMap = [:]

words.each { word ->
    frequencyMap[word] = frequencyMap.get(word, 0) + 1
}

frequencyMap.each { word, count ->
    println "$word → $count"
}

