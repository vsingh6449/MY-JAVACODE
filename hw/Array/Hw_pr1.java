import java.util.*;

public class Hw_pr1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 5 elements of an array : ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.print("Sum of all elements: "+sum);

    }
}
