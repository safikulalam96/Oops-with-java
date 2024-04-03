package abstraction;

abstract class Vehicle{
    // int no_of_tyres;
   abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println("Car ki 4 wheels hota ha");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike ki 2 wheels hota ha");
    }
   
}

public class Abstract_class {
    public static void main(String[] args) {
        // Vehicle vehicle=new vehicle(); cannot use because the parent class 
        // is Abstraction class which means it will only hold essential information
        // or a method without body text so there is no point of creating a object for it
        Car obj1 =new Car();
        Bike obj2= new Bike();
        obj1.start();
        obj2.start();
    }
}
