class Employee{
    String name;
    int phone;
    String address;
    int salary;
    
    void show_salary(){
        System.out.println(this.salary);
    }

    // public Employee(String name, int phone, String address, int salary) {
    //     this.name = name;
    //     this.phone = phone;
    //     this.address = address;
    //     this.salary = salary;
    // }
    
}
class Officer extends Employee{
    String specilization;
    // public Officer(string specilization){
    //     super(String name,int phone,String address,int salary);
    //     this.specilization=specilization;
    // }
    void display(){
        System.out.println(this.specilization);
        //    System.out.println(this.department);
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.phone);

    }
}
class Manager extends Employee{
    String department;
     void display(){
        System.out.println(this.department);
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.phone);

    }
}

public class sample {
    public static void main(String[] args) {
        Officer officier =new Officer();
        Manager manager= new Manager();

        officier.display();
        manager.display();

    
    }
}
