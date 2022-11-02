import java.util.*;

public class palindrome {
    public static boolean isPalindrom(int n) {
        int palindroome = n;
        int rev = 0;

        do{
            int lastDigit = palindroome % 10;
            rev = (rev * 10) + lastDigit;
            palindroome /= 10; // agar humne palindroome as a variable use nahi kia tho aur direct n integer
                               // use kia hota tho iss line mee uski value jo number humne input mee dia hee
                               // uske first number k equal ho jaati h
        } while (palindroome != 0);

        if (n == rev) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number n: ");
        int n = sc.nextInt();
        if (isPalindrom(n)) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

}
