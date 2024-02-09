abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car ki 4 wheels hota hai");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike ki 2 wheels hota hai");
    }
}

public class test{
    public static void main(String[] args) {
        Car obj1 = new Car();
        Bike obj2 = new Bike();
        obj1.start();
        obj2.start();
    }
}
