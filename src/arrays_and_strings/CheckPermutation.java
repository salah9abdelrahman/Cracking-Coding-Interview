package arrays_and_strings;

import java.util.Arrays;

public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(checkPermutation("salah", "hasal"));
        System.out.println(checkPermutation("salah", "hasnl"));
    }

    static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    static String sort(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return Arrays.toString(c);
    }
}
