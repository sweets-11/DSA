import java.util.*;

public class calculator {
    public static float sum(float a, float b) {
        return a + b;
    } 

    public static float minus(float a, float b) {
        return a - b;
    }

    public static float divide(float a, float b) {
        return a / b;
    }

    public static float multiply(float a, float b) {
        return a * b;
    }

    public static float modulo(float a, float b) {
        return a % b;
    }

    public static void main(String args[]) {
        try (// Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter value of a :");
            float a = sc.nextFloat();
            System.out.println("Enter value of b :");
            float b = sc.nextFloat();

            System.out.println("Enter operator +, -, *, /, %:");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println(sum(a, b));

                    break;

                case '-':
                    System.out.println(minus(a, b));

                    break;

                case '*':
                    System.out.println(multiply(a, b));

                    break;

                case '/':
                    System.out.println(divide(a, b));

                    break;

                case '%':
                    System.out.println(modulo(a, b));

                    break;

                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        }

    }

}
