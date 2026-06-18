class Arithmetic {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

class Adder extends Arithmetic {
    // Inherits add method from Arithmetic
}

public class Solution2 {
    public static void main(String[] args) {
        // Create an Adder object (as required by the problem)
        Adder adder = new Adder();
        
        // Print the superclass message
        System.out.println("My superclass is: Arithmetic");
        
        // Test the add method with the sample values
        System.out.print(adder.add(42, 13) + " " + adder.add(13, 20));
    }
}