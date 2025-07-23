/*2. Calculate Factorial:
Given an integer n (e.g., n = 5), write a Java program using a for loop to calculate its factorial (n\!). 
Print the result. (Recall: 5\! = 5 \\times 4 \\times 3 \\times 2 \\times 1 = 120). */

import java.util.*;

public class Hw_pr2 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num = sc.nextInt();
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+num+" is: "+fact);
    }

}
