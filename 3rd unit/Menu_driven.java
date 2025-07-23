import java.util.Scanner;
public class Menu_driven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. find Odd or Even");
        System.out.println("2. Addition of two no.");
        System.out.println("3. Multiplication of two no.");
        System.out.println("4. Exit");
        System.out.println("------------------------------");
        int i;
        System.out.print("Enter the no. you want to perform : ");
        i = sc.nextInt();
        switch (i)
        {
            case 1:
            {
                int a;
                System.out.print("Enter the no. ");
                a = sc.nextInt();
                if(a % 2 ==0){
                    System.out.println(a + " No. is even");
                }else{
                    System.out.println(a + " No. is odd");
                }
            }
            break;
            case 2:
            {
                int var1,var2,sum;
                System.out.print("Enter the first no. : ");
                var1 = sc.nextInt();
                System.out.print("Enter the Second no. : ");
                var2 = sc.nextInt();
                sum = var1 + var2;
                System.out.println("Sum of two no."+ sum);
            }
            break;
            case 3:
            {
                int var1,var2,mul;
                System.out.print("Enter the first no. : ");
                var1 = sc.nextInt();
                System.out.print("Enter the Second no. : ");
                var2 = sc.nextInt();
                mul = var1 * var2;
                System.out.println("Multiplication of two no."+ mul);
            }
            break;
            case 4:
            System.out.println("Exit Successfully");
            System.exit(0);
            break;
            default:
            System.out.println("You entered the wrong no.");
        }
    }
    
}
