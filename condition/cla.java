import java.util.*;

import javax.swing.text.TabExpander;

public class cla {
    public static void main(String args[]) {
        // 500000 pr no Tax;
        // 500000 - 1000000 20% tax;
        // above 1000000 30% tax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income :");
        int num = sc.nextInt();
        int tax;

        if (num < 500000) {
            tax = 0;
        } else if ((num >= 500000) && (num < 1000000)) {
            tax = (int) (num * .2);
        } else {
            tax = (int) (num * .3);
        }
        System.out.println("Tax =" + tax);
    }

}
