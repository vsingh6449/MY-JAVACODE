import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner bb = new Scanner(System.in);
        int a;
        System.out.print("Enter a Number : ");
        a = bb.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println(a + " is divisible by 3 and 5");
        }else{
            System.out.println(a + " is not divisible by 3 and 5");
        }
        System.out.println("-------------------------");
        bb.close();
    }
}
