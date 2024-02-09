class School_Population{
    int age;
    String name;
    void display(){
        // this.age=age;
        // this.name=name;
        System.out.println(this.age);
        System.out.println(this.name);
    }

}
class Student extends School_Population{
    int rollno;
    String class_enrolled;

    void display() {
        // this.rollno =rollno;
        // this.class_enrolled = class_enrolled;
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.rollno);
        System.out.println(this.class_enrolled);
    }

}
class Employee extends School_Population{
   

}
class Staff extends Employee{
    int employee_id;
    int date;
    void display(){
        System.out.println(this.employee_id);
        System.out.println(this.date);
         System.out.println(this.age);
        System.out.println(this.name);
    }
}
class Teacher extends Employee{

}

public class employees {
    public static void main(String[] args) {
        
    }
    
}
