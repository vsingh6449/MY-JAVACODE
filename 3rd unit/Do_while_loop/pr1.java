
import java.util.*;

public class pr1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("==========> ");
            System.out.print("Enter the condition you want to perform btw 1 to 4 : ");
            i = sc.nextInt();
            switch (i) {
                case 1: {
                    int var1, var2, sum;
                    System.out.print("Enter the first no. : ");
                    var1 = sc.nextInt();
                    System.out.print("Enter the Second no. : ");
                    var2 = sc.nextInt();
                    sum = var1 + var2;
                    System.out.println("Sum of" +var1+"and"+var2+" is = " + sum);

                }
                break;
                case 2: {
                    int var1, var2, sub;
                    System.out.print("Enter the first no. : ");
                    var1 = sc.nextInt();
                    System.out.print("Enter the Second no. : ");
                    var2 = sc.nextInt();
                    sub = var1 - var2;
                    System.out.println("Subtraction of" +var1+"and"+var2+" is = " +sub);

                }
                break;
                case 3: {
                    int var1, var2, mul;
                    System.out.print("Enter the first no. : ");
                    var1 = sc.nextInt();
                    System.out.print("Enter the Second no. : ");
                    var2 = sc.nextInt();
                    mul = var1 * var2;
                    System.out.println("Multiplication of" +var1+"and"+var2+" is = " + mul);
                }
                break;
                case 4: {
                    int var1, var2, div;
                    System.out.print("Enter the first no. : ");
                    var1 = sc.nextInt();
                    System.out.print("Enter the Second no. : ");
                    var2 = sc.nextInt();
                    div = var1 / var2;
                    System.out.println("Division of" +var1+"and"+var2+" is = " + div);
                }
                break;
                case 5:
                    System.out.println("Exit Successfully");
                    System.exit(0);
                default:
                    System.out.println("You entered the wrong condition");
            }
        }while (true);

    }
}
