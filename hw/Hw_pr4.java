/*4. Power of 2:
   Write a Java program using a for loop to calculate and print 2^n for n from 0 to 5. 
   (i.e., 2^0, 2^1, 2^2, 2^3, 2^4, 2^5). */

   public class Hw_pr4 {

    public static void main(String[] args) {
        System.out.println("Calculate 2^n for n from 0 to 5");
        double n= 0 ;
        for (int i = 0; i <= 5; i++) {
            n = Math.pow(2, i);
            System.out.println("2^" + i + " = " + n);
        }

    }

}
