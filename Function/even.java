import java.util.*;

public class even {
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        
        if(isEven(n)){
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }
}


