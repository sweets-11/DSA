public class array_as_function_arguments {


    public static void update(int marks[]){
            for(int i= 0; i<marks.length; i++){
                marks[i] +=1;// this loop update value of marks by one
            }
            return;
    }

    public static void main(String[] args) {
        int marks[] = {50, 62, 78};
        update(marks);

        //print marks
         for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
         }
        
         System.out.println();
    }
}
