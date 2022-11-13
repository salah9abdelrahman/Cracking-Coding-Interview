package arrays_and_strings;

public class OneWay {
    public static void main(String[] args) {
        System.out.println(oneWay("pale", "ple"));
        System.out.println(oneWay("pales", "pale"));
        System.out.println(oneWay("pale", "bale"));
        System.out.println(oneWay("pale", "bae"));
    }

    // o(n)
    static boolean oneWay(String str1, String str2) {
        if (str1.length() + 1 == str2.length()) {
            // insert
            int numOfDiff = 0;
            for (int i = 0, j = 0; i < str1.length(); i++, j++) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    numOfDiff++;
                    j++;
                }
                if (numOfDiff > 1) {
                    return false;
                }
            }
            return true;
        } else if (str1.length() == str2.length() + 1) {
            // remove
            int numOfDiff = 0;
            for (int i = 0, j = 0; i < str2.length(); i++, j++) {
                if (str1.charAt(i) != str2.charAt(j)) {
                    numOfDiff++;
                    i++;
                }
                if (numOfDiff > 1) {
                    return false;
                }
            }
            return true;

        } else if (str1.length() == str2.length()) {
            int numOfDiff = 0;
            for (int i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    numOfDiff++;
                }
                if (numOfDiff > 1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
