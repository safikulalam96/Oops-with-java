package polymorphism;
class Car{
    void name(){
        System.out.println("fatfatiii");
    }
}

class Car2 extends Car{
   @Override
   void name(){
        System.out.println("Jongga");
    }
   
}
class Car3 extends Car{
    @Override
    void name(){
        System.out.println("Tempuu");
    }
}

public class method_overriding {
    public static void main(String[] args) {

        Car2 naam= new Car2();
        Car3 naam2= new Car3();
        // int r1= naam name();
        // System.out.println(r1);
        naam.name();
        naam2.name();
    }
}
