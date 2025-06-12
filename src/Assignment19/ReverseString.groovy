package Assignment19

def temp = "KnowKode";
def result = "";
for(def first = temp.length() - 1; first >= 0; first--) {
    def ch = temp.charAt(first);
    result += ch;
}
println(result);
