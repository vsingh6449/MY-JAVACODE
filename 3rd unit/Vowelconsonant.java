import java.util.Scanner;

public class Vowelconsonant{
    public static void main(String[] args) {
        char x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet : ");
        x = sc.next().charAt(0);
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            System.out.println(x + " is vowel");
        } else {
            System.out.println(x + " is consonant");
        }
        sc.close();
    }
}
