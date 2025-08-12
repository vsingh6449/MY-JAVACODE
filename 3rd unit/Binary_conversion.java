
import java.util.*;

public class Binary_conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any decimal number : ");
        int a;
        a = sc.nextInt();
        int temp = 1;
        int rem = 0;
        int binary = 0;
        while (a > 0) {
            rem = a % 2;
            binary = binary + rem * temp;
            temp = temp * 10;
            a = a / 2;
        }
        System.out.print("Binary of the number : " +binary);

    }
}


