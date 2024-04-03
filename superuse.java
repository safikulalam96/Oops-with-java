class A{
    public A(){
        System.out.println("A first is running");
    }
    public A(int n){
        System.out.println("A second is running");
    }
}
class B extends A{
    public B(){
        System.out.println("B first is running");
    }
    
    public B(int n){
        this();
        System.out.println("B second is running");
    }
    
}
public class superuse{
    public static void main(String[] args){
    B b =new B(5);
    }
    
}
