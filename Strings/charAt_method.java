public class charAt_method{

    public static void printLetters(String fullname){
        for(int i=0; i<fullname.length(); i++){// length < iss lie rakha because 0 se start hota h.
            System.out.print(fullname.charAt(i) + " ");// only i likh kr nahi chorna no. print krdega.
        }
    }
    public static void main(String[] args) {
        String firstName = "Aniket";
        String lastName = "Jain";
        String fullName = firstName + " " + lastName;
        printLetters(fullName);
    }
}