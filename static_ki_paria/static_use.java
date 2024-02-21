package static_ki_paria;

class Mobile{
    int price;
    String brand;
    String Model;
    static String ownername="Safikul Alam"; /*static keyword is used to share a common
    property with all the object for memory efficiency(because if we write the 
    common property with all the object then it will occupy the 
    space according to the number of the objects created)*/



    public Mobile(int price,String brand,String Model){
        this.price=price;
        this.brand=brand;
        this.Model=Model;
    }
    void display(){
        System.out.print("price: "+ price+ " Brand name: "+ 
        brand+ "Model name: "+ Model+ " Ownership name: "+ ownername);
    }

}

public class static_use {
    public static void main(String[] args) {
        Mobile obj2=new Mobile(99, "chinaphunn", "choda");
        Mobile obj=new Mobile(160,"I-phunn","iphone 14");
       obj.display();
       obj2.display();
    }
    
}
