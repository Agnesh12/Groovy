package Assignment19

def name = "Groovy Programming";
vowelCount = 0;
 for(int i = 0; i < name.length(); i++) {
     def ch = name.charAt(i).toLowerCase();
     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelCount++;
    }
}
println("Vowel Counts: ${vowelCount}")
