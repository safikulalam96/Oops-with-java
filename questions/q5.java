package questions;
import java.util.Scanner;
public class q5 {
    public static boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
        return(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check it's vowel or not: ");
        char ch= sc.next().charAt(0);

        if(isvowel(ch)){
            System.out.println("It is vowel");
        }
        else
            System.out.println("It is constant");
    }
}
