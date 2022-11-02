package practice;
import java.util.*;

public class largest_string {

    public static float largestString(String fru1, String fru2){
        int f1 = fru1.length();
        int f2 = fru2.length();
         
        return (float)Math.max(f1, f2);


    }
    public static void main(String[] args) {
        String fru1 = "apple";
        String fru2 = "kiwi";
        System.out.println(largestString(fru1, fru2));
    }
}
