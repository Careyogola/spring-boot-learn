
// implementing inheritance 
class Animal {
    void walk() {
        System.out.println("I walk");
    }
}

class Bird extends Animal {
    void sing() {
        System.out.println("I sing");
    }

    void fly() {
        System.out.println("I fly");
    }
}





public class Solution {

    public static void main(String[] args) {
        // create the instance 
        // object

        Bird bird = new Bird();
        bird.fly();
        bird.sing();
        bird.walk();
    }
    
}
