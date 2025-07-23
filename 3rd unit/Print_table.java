
import java.util.Scanner;

public class Print_table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the no. of multiplication table :");
        num = sc.nextInt();
        System.out.println("----------------------------------------");
        System.out.println("Table of " + num);
        System.out.println("------------");
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(num + " * " + i + " = " + (num * i));
        }

    }

}
