/* 1. Print Even Numbers in Reverse:
 Write a Java program using a for loop to print all even numbers from 20 down to 2 
(inclusive), each on a new line.*/

public class Hw_pr1{

    public static void main(String[] args) {
        System.out.println("Even no. btw 20 to 2 in downward series");
        System.out.println("----------------------------------------");
        for(int i = 20;i>=1;i--){
            if(i%2==0){
                System.out.println("i => " +i);
            }
        }
    }
}