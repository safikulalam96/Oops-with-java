package questions;

import java.util.Scanner;

public class q2 {
    public static int gcd(int a, int b){
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First number ");
        int a =sc.nextInt();
        System.out.println("Enter the second number ");
        int b= sc.nextInt();

        int c= gcd(a,b);
        System.out.println(c);

    }
}

