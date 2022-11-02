public class Types_of_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();//yaha by default konsa constructor call hoga, sabse pehele uske parameters match hoge like yaha koi parameter nahi h aur neeche bhi nahi h tho vo match hoge
        Student s2 = new Student("Aniket");// neeche String parameter h aur yaha string value pass kri tho ye match ho gye
        Student s3 = new Student(123);
        // Student s4 = new Student("Aman", 24);// yaha pr koi constructor call nahi hoga because esa koi constructor h hi nahi jha parameter me String aur int pass hua ho;
    }
}

class Student {
    String name;
    int roll;

    Student() {// non-parameterized
        System.out.println("constructor is called....");
    } // let's suppose hum is constructor ko hata dee tho upper jo first object h vaha error aajaega because java by default koi constructor nahi bnata agar koi aur constructor exist krta hoto like neeche 2 bane h parameterized vaale, aur agar haame first object ko chalana h tho haame baaki constructors 

        Student(String name) {//parameterized
            this.name = name;
        }
        Student (int roll) {//parameterized
            this.roll = roll;
        }
    }
