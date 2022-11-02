import java.util.*;

public class subsrtring {
    public static String subString(String str, int si, int ei) {
        String substr = " ";
        for(int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        String st = "DemonOfDemonic";
        System.out.println(st.substring(0,5));// 5 excluded;
        System.out.println(subString(str, 0, 5));// 5 excluded;
    }
}
