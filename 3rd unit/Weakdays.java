
import java.util.Scanner;

public class Weakdays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1;
        System.out.println("Enter the no. of day btw (1 - 7) : ");
        var1 = sc.nextInt();
        switch (var1) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Your enterted the wrong no.");
        }

    }
}
