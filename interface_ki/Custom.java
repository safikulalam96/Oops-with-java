package interface_ki;

interface A{
    void Chuchi();
    void Gand();
}
interface B extends A{
    void Laura();
    void Chest();
}

class X implements B{
    public void Laura(){
        System.out.println("10 inch ka laura");
    }
    public void Chest(){
        System.out.println("Bara Chati");
    }
    public void Chuchi(){
        System.out.println("Jule huwee Chuchii");
    }
    public void Gand(){
        System.out.println("Safet wala Gand");
    }
}

public class Custom {
    public static void main(String[] args) {
        X obj=new X();
        obj.Chest();
        obj.Chuchi();
        obj.Gand();
        obj.Laura();
    }
    
}
