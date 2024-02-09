package polymorphism;
class Cal{
    int add(int m,int n){
        return m+n;
    }
    int add(int m,int n, int x){
        return m+n+x;
    }
}

public class method_overloading {
    public static void main(String[] args) {

        Cal obj= new Cal();
        int r1= obj.add(5,2,8);
        System.out.println(r1);
    }
}


