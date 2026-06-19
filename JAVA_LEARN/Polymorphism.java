


class Parent {
    int value = 10;
    
    void show() {
        System.out.println("Parent Method: " + value);
    }
}

class Child extends Parent {
    int value = 20;

    @Override
    void show() {
        System.out.println("Child Method: " + value);
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Parent obj = new Child();
        System.out.println("Variable: " + obj.value);
        obj.show();
    }
}
