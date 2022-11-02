import java.util.*;

public class binary_search {

    public static int binarySearch(int num[], int key) {
        int start = 0;//start index 0 hota h iss lie start with 0;
        int end = num.length - 1;//length function poora lenght count krta h like yaha length 7 he aur inder 1 kaam count kr ta he iss lie -1
        while (start <= end) {
            int mid = (start + end) / 2;

            //comparison

            if (num[mid] == key) {//found
                return mid;
            }
            if (num[mid] < key) {//right
                start = mid + 1;

            } else{//left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        System.out.println("Enter multiples of 2 between 2-14 ");
        int key = sc.nextInt();
        int index = binarySearch(num, key);

        if(index == -1){
            System.out.println("Invalid operation ");
        } else{
            System.out.println("Binary search result is :" + index);
        }
    }

}
