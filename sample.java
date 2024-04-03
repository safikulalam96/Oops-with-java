abstract class shape{
    void numberofsides(){
    }
}
class rectangle extends shape{
    void numberofsides(){
        System.out.println("I have 4 sides");
    }
}
class triangle extends shape{
    void numberofsides(){
        System.out.println("I have 3 sides");
    }
}
class hexagon extends shape{
    void numberofsides(){
        System.out.println("I have 6 sides");
    }
}

public class sample{
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.numberofsides();
        triangle tri = new triangle();
        tri.numberofsides();
        hexagon hex = new hexagon();
        hex.numberofsides();

    }
}