public class prac {

    public static void biToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;// power
        int decNum = 0;// decimal
        while (binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum /= 10;
            
        }
            System.out.println("Decimal of " + myNum + "=" + decNum);
        }

        public static void main(String args[]) {
            biToDec(5);
        }
    
    }
    
    

