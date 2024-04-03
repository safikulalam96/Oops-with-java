package questions;
import java.util.Scanner;

public class q1 {
    public static void swap(int a,int b){
        // int temp=0;
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The value of  a: "+ a);
        System.out.println("The value of b: "+b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        
        System.out.println("Before swapping: a= "+a+" b= "  + b);
        swap(a,b);
      

    }
}
