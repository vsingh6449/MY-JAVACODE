import java.util.Scanner;
public class Checkleapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter a year = ");
        year = sc.nextInt();
        if(year%4==0 || year%400==0 && year%100!=0){
            System.out.println(year+ " is a Leap year");
        }
        else{
            System.out.println(year+ " is not a Leap year");
        }
        sc.close();
    }
    
}
