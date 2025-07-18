// Wap to check no. is positive,negative or zero;
import java.util.Scanner;

public class CheckPositiveNeagtive {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        int num;
        System.out.print ("Enter any Number : ");
        num = ab.nextInt();
        
        if(num>0){
            System.out.println(num+ " is positive");
        }
        else if(num<0){
            System.out.println(num+ " is Negative");
        }
        else{
            System.out.println(num+ " is Zero");
        }
        ab.close();
    }
    
}
