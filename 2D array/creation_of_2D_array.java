import java.util.*;
public class creation_of_2D_array{

    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key){
                System.out.println("found at cell (" + i +"," + j +")" );
                return true;
                }
            }
        }
        System.out.println("key not found :");
        return false;
    }




public static void main(String[] args) {
    int  matrix[][] = new int[3][3];
    int n = matrix.length, m= matrix[0].length;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter index value 1 to 9 :");
    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            matrix[i][j] = sc.nextInt();// enter matrix element input

        }
    }
    // output
    for(int i=0; i<m; i++) {
        for(int j=0; j<m; j++) {
         System.out.print(matrix[i][j] + " ");

        }
        System.out.println();
    }
    search(matrix, 5);
}

}