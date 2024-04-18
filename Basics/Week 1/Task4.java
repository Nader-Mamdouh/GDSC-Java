import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*Write a program that takes the weekday number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday) as input from the user and prints the corresponding weekday name.*/
        Scanner Number = new Scanner(System.in);
        System.out.println("Please Enter Number of Day : ");
        int day = Number.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thr");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        }
    }
}
