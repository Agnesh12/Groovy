package Assignment20

def words = ["hi", "hello", "bye", "good", "sun"]

def grouped = [:].withDefault { [] }

words.each { word ->
    grouped[word.length()] << word
}

grouped.each { length, list ->
    println "$length → $list"
}
