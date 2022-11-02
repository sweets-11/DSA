import java.util.*;

public class check_Ever_or_odd {

    public static void bit_manupulation(int n) {
        int bitMast = 1;
        if ((n & bitMast) == 0) {
            System.out.println("Even number" + n);
        } else {
            System.out.println("Odd number" + n);
        }
    }

    public static void main(String[] args) {
        bit_manupulation(3);
        bit_manupulation(9);
        bit_manupulation(0);
        bit_manupulation(2);

    }

}
