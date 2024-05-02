import java.util.InputMismatchException;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        while (true) {
            try {
                System.out.print("Enter the first integer: ");
                num1 = scanner.nextInt();

                System.out.print("Enter the second integer: ");
                num2 = scanner.nextInt();

                int sum = num1 + num2;
                System.out.println("Num1 : " + num1 + " +  Num2: " + num2 + " = " + sum);
                break; 
            } 
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
