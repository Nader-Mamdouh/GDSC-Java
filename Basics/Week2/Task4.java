import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
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
