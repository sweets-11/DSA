public class clear_last_bit {
    public static int clearLastbit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearLastbit(15, 2));
    }
}
