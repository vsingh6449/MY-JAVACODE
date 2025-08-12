import java.util.Scanner;
public class Hw_pr3 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.print("Reverse String : " +sb.toString());
    }   
}
