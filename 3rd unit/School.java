
import java.util.Scanner;

public class School{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;
        System.out.println("Enter the Grade: ");
        grade = sc.next().charAt(0);
        switch (grade) {
        case 'A':
        case 'a':
            System.out.println("Excellent");
            break;
        case 'B':
        case 'b':
            System.out.println("Good");
            break;
        case 'C':
        case 'c':
            System.out.println("Average");
            break;
            case 'D':       //we can also write like this (case 'd','D')
            case 'd':
            System.out.println("fail");
            break;

            default:
                System.out.println("You entered the wrong grade");
        }

    }
}
 
    

