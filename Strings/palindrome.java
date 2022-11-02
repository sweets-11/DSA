import java.util.*;

public class palindrome {

    public static boolean isPalindrome(String str){ //O(n)
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n - i- 1)){// n-1 iss lie nahi kia because vo update hi nahi hota like n=7 hee yaha -1 ye 6 ho jaata aur har baar vahi reheta
                return false; // not a palindrome
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.next();
        System.out.println(isPalindrome(str));
    }
}
