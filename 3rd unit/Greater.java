
import java.util.Scanner;

public class Greater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Enter num1 = ");
        num1 = sc.nextInt();
        System.out.print("Enter num2 = ");
        num2 = sc.nextInt();
        System.out.print("Enter num3 = ");
        num3 = sc.nextInt();
        
        if (num1 > num2 && num1> num3) {
            System.out.println(num1 + " is greater");
        } else if(num2> num1 && num2 > num3) {
            System.out.println(num2 + " is greater");
        }else{
            System.out.println(num3 + " is greater");
        }
        sc.close();
    }
}
