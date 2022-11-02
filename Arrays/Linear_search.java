public class Linear_search {

    // public static int linearSearch(int number[], int key){
    //     for(int i=0; i<number.length; i++){
    //         if(number[i] == key){
    //             return i;
    //         } 
    //     }
    //         return -1;
    //     }
    

    public static int linearSearch(String menu[], String key){
        for(int k = 0; k<menu.length; k++){
            if(menu[k] == key){
                return k;
            }
        }
            return -1;
    }

    public static void main(String args[]) {
        // int number[] = {9, 10, 12, 13, 14,20 };
        // int key = 12;
        // int index = linearSearch(number, key);

        // if(index == -1){
        //     System.out.println("NOT FOUND");
        // } else{
        //     System.out.println("key is at index :" + index);
        // }

        String menu[] = {"Samosa", "Bake-samosa", "Momos", "Dosa"};
        String key = "Momos";
        int inde = linearSearch(menu, key);

        if(inde == -1){
            System.out.println("not found");
        }
            else{
            System.out.println("index is at :" + inde);

        }

    }
}
