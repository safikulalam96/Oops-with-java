package interface_ki;

interface kalyani{
    void name();
}
interface alnasr{
    void display();
}

class Ronaldo implements kalyani,alnasr{
    public void name(){
        System.out.println("suuu");
    }
    public void display(){
        System.out.println("Hello I am Ronaldo");
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        Ronaldo r= new Ronaldo();
        r.name();
        r.display();
    }
}
