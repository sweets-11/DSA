public class Max_sub_array_sum {

    public static void printSubArray(int num[]) {
        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum += num[k];

                }
                System.out.println(sum);
                if (largest < sum) {
                    largest = sum;
                }
                if (smallest > sum) {
                    smallest = sum;
                }
            }
        }
        System.out.println("largest" + largest);
        System.out.println("smallest" + smallest);

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        printSubArray(num);
    }
}
