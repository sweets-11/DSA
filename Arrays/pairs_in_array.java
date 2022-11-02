public class pairs_in_array {

    public static void pairArrar(int num[]){
        int tp = 0;// to count how many pairs are made
        for(int i = 0; i < num.length; i++){// here array starts with 0
            int cons = num[i];// store value of num at 0 index in cons 

            for(int k = i+1; k< num.length; k++){// here array starts with 1 index
                System.out.print("(" + cons + "," + num[k] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs =" + tp);

    }

    public static void main(String[] args) {
        int num[] = {2, 4, 9, 5 ,24};
        pairArrar(num);

    }
    
}
