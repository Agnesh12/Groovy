package Assignment19

def number = 17;
def check = 0;
for(def first = 1; first <= number; first++) {
    if(number % first == 0) {
        check++;
    }
}
if(check == 2) {
    println("Prime Number");
}
else {
    println("Not a Prime Number");
}
