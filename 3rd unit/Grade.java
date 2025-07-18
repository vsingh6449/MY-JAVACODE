import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        String name;
        int per;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        name = sc.nextLine();
        System.out.print("Enter the Percentage : ");
        per = sc.nextInt();
        if(per>=90){
            System.out.println(name + " you got A+ grade");
        }
        else if(per>=80){
           System.out.println(name + " you got A grade"); 
        }
        else if(per>=70){
           System.out.println(name + " you got B+ grade"); 
        }
        else if(per>=60){
           System.out.println(name + " you got B grade"); 
        }
        else if(per>=50){
           System.out.println(name + " you got C+ grade"); 
        }
        else{
           System.out.println(name + " you are Fail"); 
        }
        sc.close();
    }
    
}
