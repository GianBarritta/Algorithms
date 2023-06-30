package Palindrome;

import java.util.Scanner;

/**
 * Algorithm that checks if a string is palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Validate palindromes");
        System.out.println("Digitize the chain to evaluate");

        String chain = scanner.nextLine();

        System.out.println(isPalindrome(chain));
    }

    public static boolean isPalindrome(String string){
        boolean sw = true;

        string = string.replace(" ","");

        for (int i = 0; i < string.length()/2; i++) {
            if (string.charAt(i)!=string.charAt(string.length()-1-i)){
                sw = false;
                break;
            }
        }

        return sw;
    }
}
