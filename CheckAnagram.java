class Anagram {
    public void checkAnagram(String str1, String str2) {
        // If lengths are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("It is not an Anagram.");
            return;
        }

        // Create a count array and initialize all values to 0
        int[] charCount = new int[256]; // Assume ASCII character set

        // Increase the count for each character in str1
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        // Decrease the count for each character in str2
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        // Check if all counts are zero
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] != 0) {
                System.out.println("It is not an Anagram.");
                return;
            }
        }

        System.out.println("It is an Anagram.");
    }
}

class CheckAnagram {
    public static void main(String[] args) {
        Anagram c = new Anagram();
        c.checkAnagram("rare", "erar"); // Example test case
    }
}
