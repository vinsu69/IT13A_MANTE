package midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String vj1 = scanner.nextLine();
        System.out.print("Enter the second word: ");
        String vinsu2 = scanner.nextLine();

        System.out.print("Enter the third word: ");
        String vince3 = scanner.nextLine();

        checkPalindrome(vj1);
        checkPalindrome(vinsu2);
        checkPalindrome(vince3);

        scanner.close();
    }

    public static void checkPalindrome(String word) {

        String cleanedWord = word.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(cleanedWord)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
