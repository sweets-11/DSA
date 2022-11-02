public class check_powOf_2 {
    public static boolean checkPowOf2(int n) {
        return (n & (n - 1)) == 0 ;

    }

    public static void main(String[] args) {
        System.out.println(checkPowOf2(15));
        System.out.println(checkPowOf2(8));
    }
}
