package chapter_3;

import java.util.Scanner;

public class email_address {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email id : ");
        String s = sc.nextLine();
        int x = s.indexOf('@');
        String z = s.substring(x+1);
        System.out.println(z);

    }
}
