package practice;

public class except_vovels {

    public static void check(String can) {

        for (int i = 0; i < can.length(); i++) {
            if(can.charAt(i) == 'a' || can.charAt(i) == 'e' || can.charAt(i) == 'i'||
            can.charAt(i) == 'o' || can.charAt(i) == 'u'){
            continue;
            }
            System.out.print(can.charAt(i) + " ");
            }
            System.out.println();


    }

    public static void main(String[] args) {
        String con = "abcdefghijklmnopqrstuvwxyz";
        check(con);
    }
}
