public class get_iTH_bit {
    public static int BitIthbit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }


    
    public static void main(String[] args) {
        System.out.println(BitIthbit(15, 2));// 10 = 1010
        System.out.println(BitIthbit(10, 3));
    }
}
