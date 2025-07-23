
import java.util.Scanner;

public class Sum_of_num {

    public static void main(String[] args) {
        System.out.print("Enter any 5 digit number : ");
        Scanner sc = new Scanner(System.in);
        int i, n, rem, sum = 0;
        n = sc.nextInt();
        for (i = 0; i <= 5; i++) {
            rem = n % 10;
            n = n / 10;
            sum = sum + rem;
        }
        System.out.println("Sum of " + sum);

    }

}
