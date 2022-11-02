import java.util.*;

public class input_output_update{
    public static void main(String args[]){
        String anime[] = new String[20];//yaha humne size declare kar dia h 20 so we can't update it in run time, and here anime[] is treated as String variable.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your favorite anime name :");
        anime[0] = sc.nextLine();// anime 1,, here index in arrray starts with 0, and we wrote [0] like this means in above variable anime[] which has size of 20 we store anime[0] at 0 place in index.
        anime[1] = sc.nextLine();//anime 2
        anime[2] = sc.nextLine();// anime 3
        anime[3] = sc.nextLine();// anme 4
        

        System.out.println("anime 1 " + anime[0]);
        System.out.println("anime 2 " + anime[1]);
        System.out.println("anime 3 " + anime[2]);
        System.out.println("anime 4 " + anime[3]);



        //in java there is alsa a length fnction which tells length of an array

        System.out.println("length of array anime is: " + anime.length);//tells length of an array here its 20



        int marks[] = new int[50];
        System.out.println("enter your marks :");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage of marks is :" + percentage + "%");


        marks[1] = 60;// update the marks to 60.
        System.out.println("update of marks 1 :" + marks[1]);
    }
}