
import java.util.*;

public class pr4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] srr = new String[5];
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print("Enter the name of " + (i + 1) + " students :");
            srr[i] = sc.nextLine();
        }
        for (i = 0; i < 5; i++) {
            System.out.println("No " + (i + 1) + "student name :" + srr[i]);
        }
    }
}
