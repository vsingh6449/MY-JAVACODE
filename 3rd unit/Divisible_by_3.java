
public class Divisible_by_3 {

    public static void main(String[] args) {
        System.out.println("No. btw 1 to 100 divisible by 3");
        System.out.println("----------------------");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("Only Divisible by 3: " +i);
            }
        }
    }

}
