
class Vehicle {
  
  public void startEngine() {
    
    System.out.println("Vehicle starting.");
    
  }
  
  public void stopEngine() {
    System.out.println("Vehicle stopping.");
    
  }
}

class Car extends Vehicle{
  
  public void startEngine() {
    System.out.println("Car starting.");
    
  }
  
  public void stopEngine() {
    System.out.println("Car stopping.");
    
  }
   
}

class MotorCycle extends Vehicle{
  public void startEngine() {
    System.out.println("Motorcycle starting.");
    
  }
  
  public void stopEngine() {
    System.out.println("Motorcycle stopping.");
    
  }
}

public class Main {
  public static void main(String []args){
    Car BMW = new Car();
    BMW.startEngine();
    BMW.stopEngine();
    
    MotorCycle Ducatti = new MotorCycle();
    Ducatti.startEngine();
    Ducatti.stopEngine();
  }
}