package arrays_and_strings;


public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(palindromePermutation("Tact Coa"));
        System.out.println(palindromePermutation("Tact Coat"));


    }

    static boolean palindromePermutation(String str) {
        int[] occurenceCount = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                occurenceCount[Character.getNumericValue(str.charAt(i)) - 10]++;
            }
        }
        int numOfOdds = 0;
        for (int i = 0; i < occurenceCount.length; i++) {
            if (occurenceCount[i] % 2 != 0) {
                numOfOdds++;
            }
        }

        return numOfOdds <= 1;
    }


}
