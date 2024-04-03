class Employee{
    String name;
    int age;
    long phone;
    String address;
    int salary;

    
    Employee(String name,int age,long phone,String address,int salary){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.address=address;
        this.salary=salary;
    }
    void printsalary(){
        System.out.println("salary: " + salary);
    }
}
class Officer extends Employee{
    String specialization;
    Officer(String name, int age, int phone, String address, int salary,String special) {
        super(name,age,phone,address,salary);
        this.specialization=special;
    }

   
}
class Manager extends Employee{
    String department;
    Manager(String name, int age, int phone, String address, int salary,String app){
    super(name,age,phone,address,salary);
    this.department=app;
    }
}

public class employees {
    public static void main(String[] args) {
        Officer off = new Officer("shamim",29,98003,"simhat",20000,"IT");
        
        Manager man= new Manager("faiz",20,963258,"haringhata",26530,"bca");

        System.out.println("Officer Details:");
        System.out.println("Name: " + off.name);
        System.out.println("Age: " + off.age);
        System.out.println("Phone Number: " + off.phone);
        System.out.println("Address: " + off.address);
        System.out.println("Specialization: " + off.specialization);
        off.printsalary();
        
        System.out.println();

        // Printing details of Manager
        System.out.println("Manager Details:");
        System.out.println("Name: " + man.name);
        System.out.println("Age: " + man.age);
        System.out.println("Phone Number: " + man.phone);
        System.out.println("Address: " + man.address);
        System.out.println("Department: " + man.department);
        man.printsalary();
    }
    
}
