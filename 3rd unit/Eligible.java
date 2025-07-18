import java.util.Scanner;

public class Eligible {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Enter your name : ");
        name=sc.nextLine();
        System.out.print("Enter your Age : ");
        age = sc.nextInt();
        if(age >= 18){
            System.out.println(name + "("+ age + ") your Eligible");
        }
        else{
            System.out.println( name + "(" + age + ") your not Eligible");
        }
        sc.close();    
    }
    
}
