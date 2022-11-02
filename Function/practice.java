// import java.util.*;

public class practice {

    public static void biToDec(int n) {
        int m = n;
        int pow = 0;// power
        int dec = 0;// decimal
        while (n > 0){
            int ld = n % 10;
            dec = dec + (ld * (int) Math.pow(2, pow));
            pow++;
            n /= 10;
            
        }
            System.out.println("binary no." + m + "decimal no." + dec);
        }


    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number :");
        // int n = sc.nextInt();
        biToDec(5);
    }

}
