package arrays_and_strings;

/*
Implement an algorithm to determine if a string has all unique characters.
-----------> What if you cannot use additional data structures?

 */

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("salah"));
        System.out.println(isUnique("Ahmed"));
    }

    // Assuming string is ASCII
    // runtime o(n) where n is len of str
    // space o(1) #128
    static boolean isUnique(String s) {
        if (s.length() > 128) {
            return false;
        }
        boolean[] charsExists = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (charsExists[c]) {
                return false;
            }
            charsExists[c] = true;
        }
        return true;
    }
}
