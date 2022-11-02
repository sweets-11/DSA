import java.util.*;

public class calp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b ");
        int b = sc.nextInt();
        System.out.println("enter the operator ");
        char operator = sc.next().charAt(0);
        do{
            System.out.println("enter 1 for + : ");
            System.out.println("enter 2 for - : ");
            System.out.println("enter 3 for * : ");
            System.out.println("enter 4 for / : ");
            System.out.println("enter 5 for % : ");
        
        
        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                System.out.println(a / b);
                break;

            case 5:
                System.out.println(a % b);
                break;

            default:
                System.out.println("Wrong operator entered :");

        }
    }

        
        while(operator != 0);
        
}

}
