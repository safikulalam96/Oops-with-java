package questions;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number: ");
      int a= sc.nextInt();
      boolean flag = false;
      for (int i = 2; i <= a / 2; ++i) {
        // condition for nonprime number
        if (a % i == 0) {
          flag = true;
          break;
        }
      }
  
      if (!flag)
        System.out.println(a + " is a prime number.");
      else
        System.out.println(a + " is not a prime number.");
    }
  }