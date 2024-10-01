class CountNumberOfRepeatedCharacter {
    public static void main(String[] args) {
        String str = "aabbbccdddd";
        Count(str);
    }

    public static void Count(String str) {
        int[] Charcount = new int[256]; // Array to store counts of all characters (ASCII values)

        // First, count the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            Charcount[str.charAt(i)]++;
        }

        // Now, iterate over the string and print the count of each character
        // Make sure to print only when the character first appears
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Print only if the character has not been printed before in the loop
            if (i == str.indexOf(currentChar)) {
                System.out.print(currentChar + "" + Charcount[currentChar]);
            }
        }
    }
}
