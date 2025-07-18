
import java.util.Scanner;

public class Checkevenodd {

    public static void main(String[] args) {
        int num;
        Scanner ab = new Scanner(System.in);
        // Enter any Integer to check even or odd
            System.out.print("Enter a Number : ");
            num = ab.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
        }

    }
}
