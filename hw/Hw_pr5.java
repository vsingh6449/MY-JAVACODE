/**5. Identify Prime Numbers (Basic):
    Write a Java program using a for loop to determine if a given positive integer (e.g., int num = 17;) is a
    prime number.Print "Prime" if it is, otherwise print "Not Prime". (You'll need a nested concept or a flag 
    here, but the primary logic revolves around a single for loop checking divisibility).* */
    import java.util.*;
    public class Hw_pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num = sc.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a number that divides num
                    break; // No need to check further
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }
}

