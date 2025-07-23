/*3. Numbers Divisible by 3:
   Write a Java program using a for loop to print all numbers between 1 and 30 (inclusive) 
   that are perfectly divisible by 3. */

   public class Hw_pr3 {

    public static void main(String[] args) {
        System.out.println("Even no. btw 1 to 3 prefectly divisible by 3");
        System.out.println("---------------------------------------------");
        for (int i = 1; i <= 30; i++ ){ 
            if (i % 3 == 0) {
                System.out.println("i => " + i);
            }
        }
    }
}
