import java.util.*;

public class average {
    public static int aveOfThreeno(int a, int b, int c) {
        int ave = (a + b + c) / 3;

        return ave;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A: ");
        int a = sc.nextInt();

        System.out.println("Enter value of B: ");
        int b = sc.nextInt();

        System.out.println("Enter value of C: ");
        int c = sc.nextInt();

        System.out.println(aveOfThreeno(a, b, c));


    }

}
