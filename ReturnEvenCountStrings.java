class EvenString {
    public void returnEven(String str) {
        int maxsize = str.length();
        String ans = "";
        int i = 0, j = 0, count = 0;

        while (i < maxsize) {
            // Skip leading spaces
            while (i < maxsize && str.charAt(i) == ' ') i++;
            
            j = i; // Set j to current i position
            // Find the end of the word
            while (j < maxsize && str.charAt(j) != ' ') {
                j++;
                count++;
            }

            // Extract word from i to j
            if (i < j) { // to handle cases when i = j = maxsize
                ans = str.substring(i, j);
                if (count % 2 == 0) {
                    System.out.println(ans);
                }
            }

            // Move i to the next word's start and reset count
            i = j;
            count = 0;
        }
    }
}

class ReturnEvenCountStrings {
    public static void main(String[] args) {
        EvenString s = new EvenString();
        s.returnEven("Hello world this is Nikhil Pawar from Karad");
    }
}
