
import java.util.*;

public class Hw_pr6 {

    public static void main(String[] args) {
        String pss;
        System.out.print("Enter the your password minimum 6 digit: ");
        Scanner sc = new Scanner(System.in);
        String pw = sc.nextLine();
        StringBuffer password = new StringBuffer(pw);

        if (password.length() > 5) {
            password.insert(2, '@');
            password.insert(4, '$');
            password.insert(password.length() - 1, '#');
        }
        password.reverse();
        System.out.print("Your new construct password : " + password.toString());
    }

}
