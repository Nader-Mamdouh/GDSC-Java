import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       /*Write a Java program that takes two numbers as input from the user and calculates their sum, difference, product, and division.*/
        Scanner Number = new Scanner(System.in);
        System.out.println("Hello in Simple Calculator");
        System.out.println("Enter Number 1: ");
        int Number1 = Number.nextInt();
        System.out.println("Enter Number 2: ");
        int Number2 = Number.nextInt();
        int sum = Number1 + Number2 ;
        System.out.println(sum);
        int sub = Number1 - Number2 ;
        System.out.println(sub);
        int mul = Number1 * Number2 ;
        System.out.println(mul);
        if (Number2!=0)
        {
            int div = Number1 / Number2 ;
            System.out.println(div);
        }
        else 
        {
            System.out.println("Invalid Operation");
        }
    }
}
