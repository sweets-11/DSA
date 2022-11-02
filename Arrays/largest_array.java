import java.util.*;

public class largest_array {

    public static int largest_Array(int marks[]) {
        int largest = Integer.MIN_VALUE;// -infinity (negative)
        int smallest = Integer.MAX_VALUE;// +infinity (positive)

        for (int i = 0; i < marks.length; i++) {
            if (largest < marks[i]) {
                largest = marks[i];
            }
            if (smallest > marks[i]) {
                smallest = marks[i];
            }

        }
        System.out.println("smallest value is :" + smallest);

        return largest;
    }

    public static void main(String[] args) {
        int marks[] = { 30, 52, 57, 65, 98, 85 };
        System.out.println("Largest value is " + largest_Array(marks));

    }
}
