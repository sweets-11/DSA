import java.util.Scanner;

import javax.sql.StatementEvent;

// public class practice {
// public static void main(String args[]) {
// int num = 0;
// while (num < 100) {
// System.out.println("Fuck off");
// num++;
// }
// System.out.print("hey");
// }
// }

// public class practice{
// public static void main(String args[]){
// int num = 1;
// while(num <= 10){
// System.out.println(num);
// num++;
// }
// }
// }

// public class practice{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int num = 1;
// System.out.print("Enter you number :");
// int num2 = sc.nextInt();

// while(num < num2){
// System.out.print(num + " ");
// num++;
// }
// System.out.println();
// }
// }

// public class practice{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number :");
// int num = sc.nextInt();

// int sum = 0;
// int n = 1;
// while(n <= num){
// sum += n;
// n++;
// }
// System.out.print("The sum of your n mumber is :" + sum);
// }
// }

// public class practice{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number :");
// int num = sc.nextInt();

// int product = 1;
// int n = 1;
// while(n <= num){
// product *= n;
// n++;
// }
// System.out.print("The product of your n mumber is :" + product);
// }
// }

// public class practice{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// do{
// int lastDigit = n % 10;
// System.out.print(lastDigit);
// n = n / 10;
// } while(n > 0);
// System.out.println();

// }
// }

/*
 * public class practice{
 * public static void main(String args[]){
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int rev = 0;
 * do{
 * int lastDigit = n % 10;
 * rev *= 10 + lastDigit;
 * System.out.print(lastDigit);
 * n = n / 10;
 * } while(n > 0);
 * System.out.println();
 * 
 * }
 * }
 */

/*
 * public class practice{
 * public static void main(String args[]){
 * int i = 1;
 * 
 * do{
 * if(i==13){
 * break;
 * }
 * System.out.println(i);
 * i++;
 * } while(i <= 20);
 * }
 * }
 */

// public class practice{
// public static void main(String args []){
// Scanner sc = new Scanner(System.in);
// do{
// System.out.print("Enter your number :");
// int i = sc.nextInt();
// if(i % 10 == 0){
// break;
// }
// System.out.println(i);

// } while(true);
// }
// }

// public class practice {
// public static void main(String args[]) {
// // for(int i = 1; i<=15; i++){
// // if(i==7){
// // continue;
// // }
// // System.out.println(i);
// }
// }

// public class practice{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// do{
// int n = sc.nextInt();
// if(n%10==0){
// continue;
// }
// System.out.println(n);
// } while(true);
// }

// }

// public class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int k = 1; k <= i; k++

// ) {
// System.out.print("*");

// }
// System.out.println();
// }
// }
// }

// public class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int k = 1; k <= n - i + 1; k++) {
// System.out.print("*");
// }
// System.out.println();

// }
// }
// }

// public class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for (int i = 1; i <= n; i++) {
// for (int k = 1; k <= i; k++

// ) {
// System.out.print(k);

// }
// System.out.println();
// }
// }
// }

// public class practice {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter number of line that you want to display :");
// int n = sc.nextInt();
// char ch = 'A';
// for (int i = 1; i <= n; i++) {
// for (int k = 1; k <= i; k++

// ) {
// System.out.print(ch);
// ch++;
// }
// System.out.println();
// }
// }
// }

// public class practice {
// public static int claculateSum(int a, int b) {
// int sum = a + b;
// return sum;
// }

// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int sum = claculateSum(a, b);
// System.out.println("sum of a and b :" + sum);

// }
// }

// public class practice {
// public static int factorial(int n) {
// int f = 1;
// for (int i = 1; i <= n; i++) {
// f = f * i;
// }

// return f;
// }

// public static int binCoeff(int n, int r) {
// int fact_n = factorial(n);
// int fact_r = factorial(r);
// int fact_nmr = factorial(n-r);

// int bincoeff = fact_n / (fact_r * fact_nmr);

// return bincoeff;
// }

// public static void main(String args[]) {
// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// // int fac = factorial(a);
// System.out.println(binCoeff(5, 2));
// }
// }

// public class calculator {
//     public static float sum(float a, float b) {
//         return a + b;
//     }

//     public static float minus(float a, float b) {
//         return a - b;
//     }

//     public static float divide(float a, float b) {
//         return a / b;
//     }

//     public static float multiply(float a, float b) {
//         return a * b;
//     }

//     public static float modulo(float a, float b) {
//         return a % b;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter value of a :");
//         float a = sc.nextFloat();
//         System.out.println("Enter value of b :");
//         float b = sc.nextFloat();

//         System.out.println("Enter operator +, -, *, /, %:");
//         char operator = sc.next().charAt(0);

//         switch (operator) {
//             case '+':System.out.println(sum(a, b));

//                 break;

//             case '-':System.out.println(minus(a, b));

//                 break;

//             case '*':System.out.println(multiply(a, b));

//                 break;

//             case '/':System.out.println(divide(a, b));

//                 break;

//             case '%':System.out.println(modulo(a, b));

//                 break;

//             default:System.out.println("Invalid Operator");
//                 break;
//         }

//     }

// }

// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the value of n :");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int k=i; k<=n; k++){
//                 System.out.print("*");
//             }
// System.out.println();

//         }
//     }
// }

// public class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the value of n :");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int k=1; k<=i; k++){
//                 System.out.print(k);
//             }
// System.out.println();

//         }
//     }
// }

// public class practice {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n :");
//         int n = sc.nextInt();
//         // int n = sc.next().charAt(0);
//         char ch = 'A';
//         for (int i = 1; i <= n; i++) {
//             for (int k = 1; k <= i; k++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();

//         }
//     }
// }



public class practice {


    public static void swap(int n, int m){
        int temp = n;
        n =m;
        m = temp;
        System.out.println("val of n "+ n);
        System.out.println("val of m "+ m);
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();       
        System.out.println("Enter the value of m :");
        int m = sc.nextInt();
        swap(n, m);
    }
}