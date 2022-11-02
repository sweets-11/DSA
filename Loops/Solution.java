import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive number -");
        int num = sc.nextInt();
        int i;
        int fact = 1;
        for (i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.print("Factorial " + fact);
    }

}