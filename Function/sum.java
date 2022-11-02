import java.util.*;

public class sum {
    public static int sumOf(int n) {
        int sum = 0;

        //To sum
        // for(int i = 1; i<=n; i++){
        //     int ld = n % 10;
        //     sum += i;
        //     n /= 10;
            


        do {
            int ld = n % 10;
            sum += ld;
            n /= 10;

        } while (n > 0);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int n = sc.nextInt();
        System.out.println(sumOf(n));
    }
}
