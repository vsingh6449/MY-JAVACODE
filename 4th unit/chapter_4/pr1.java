package chapter_4;
public class pr1 {

    public static void main(String[] args) {
        String s = "Bachelor of Computer Application";
        String[] words = s.split(" ");
        String acronym = "";
        for (int i = 0; i < 4; i++) {
            char ch = words[i].charAt(0);
            if (ch >= 'A' && ch <= 'Z') {
                acronym = acronym + ch;
            }
        }
        System.out.println(acronym);

    }

}
