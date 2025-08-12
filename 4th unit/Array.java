// public class Array {
//     public static void main(String[]args){
//         int[] arr ={1,2,3,4,5};
//         for(int i =0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//         for(int i:arr){
//             System.out.println(arr[i]);
//         }
//     }

// }
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i=0; i < arr.length ; i++) {
            System.out.print("Enter the no."+ (i+1)+ " digit: ");
             arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("No. "+(i+1)+ " is : " +arr[i]);   
        }
    }
}
