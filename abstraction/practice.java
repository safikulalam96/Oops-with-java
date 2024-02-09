package abstraction;

abstract class asli{
    int percentage;
    abstract void result();
}
class student_1 extends asli{
    void result(){
        System.out.println("student 1 result is 89% ");
    }
}

class student_2 extends student_1{
    void result(){
        // super.result();
        System.out.println("student 2 result is 92% ");
    }
}

public class practice {
    public static void main(String[] args) {
        student_2 n=new student_2();
        student_1 nn= new student_1();
        nn.result();
        n.result();
    }
    
}
