public class compare_string {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";// if any old variable holds same val. then it takes reference from there
        String s3 = new String("Tony"); // store in new part of memory, don,t take refernce from old one.

        // if (s1 == s2) { 
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }
        // System.out.println("String created with new keyword :");
        // if (s1 == s3) {
        //     System.out.println("Strings are equal");

        // } else {
        //     System.out.println("Strings are not equal");

        // }

        // == (checks at object level) -memory address ,if the value we stored in our variable is alread been store in another variable the when we compare them it will be equal as it takes reference from an old variable.




        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
            
        }

        // .equals() wether the val. store in variable equals or not
    }
}
