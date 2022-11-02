public class Super_keyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        Cow c = new Cow();
        System.out.println(c.color);
    }
}


class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal{
    Horse() {
        super();// ye animal class k constructor ko call krega pehele,, nahi likhte tho bhi krta because compiler usko default create bhi krta h
        System.out.println("horse constructor is called");
    }
}

class Cow extends Animal {
    Cow() {
        super.color = "white";
        System.out.println("cow constructor is called");
    }
}