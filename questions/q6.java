package questions;

import java.util.Scanner;

public class q6 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else
            return (n* factorial(n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int result=0;
        result=factorial(n);
        System.out.println( result);
    }
}
