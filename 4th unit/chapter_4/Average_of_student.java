
import java.util.*;

public class Average_of_student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] marks = new double[5];
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the no." + (i + 1) + " student marks : ");
            marks[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        System.out.println("Sum of marks : "+sum);
        double avg = sum/5;
        System.out.println("Average of Student marks: "+avg);

    }
}
