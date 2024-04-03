package encapsulation;

class Vehicle {
    private String color;
    
    // Getter
    public String getColor() {
      return color;

    }
    
    // Setter
    public void setColor(String c) {
      this.color = c;
    }
  }

public class getter_setter {
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        a.setColor("red");
        String result= a.getColor();
        System.out.println(result);
    }
}
