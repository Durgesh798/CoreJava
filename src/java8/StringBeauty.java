package java8;

import java.util.Scanner;

public class StringBeauty {
    public static boolean isBeautifulString(String inputString) {
            int[] charCount = new int[26]; // Assuming input only contains lowercase English letters

            // Count the occurrences of each character
            for (char c : inputString.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Check if the frequencies are in decreasing order
            for (int i = 1; i < 26; i++) {
                if (charCount[i] > charCount[i - 1]) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter string :");
            String str= sc.nextLine();
            System.out.println(isBeautifulString(str));
        }
}

