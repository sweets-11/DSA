public class update_Ith_bit {
    // public static int clearIthbit(int n, int i) {
    //     int bitMask = ~(1 << i);
    //     return n & bitMask;
    // }

    // public static int setIthbit(int n, int i) {
    //     int bitMask = 1 << i;
    //     return n | bitMask;
    // }





// or






    public static int updateIthbit(int n, int i, int newbit) {
        int bitMask = newbit << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        
        System.out.println(updateIthbit(10, 2, 0));
        System.out.println(updateIthbit(10, 2, 1));
    }
}