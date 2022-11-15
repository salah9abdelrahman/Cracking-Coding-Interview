package arrays_and_strings;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(stringCompression("aabcccccaaa"));
        System.out.println(stringCompression("aabc"));
    }

    static String stringCompression(String str) {
        StringBuilder compressed = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                counter++;
            } else {
                compressed.append(str.charAt(i));
                compressed.append(counter);
                counter = 1;
            }
        }

        // last char
        compressed.append(str.charAt(str.length() - 1));

        if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
            compressed.append(counter);
        } else {
            compressed.append(1);
        }

        return compressed.length() > str.length() ? str : compressed.toString();
    }
}
