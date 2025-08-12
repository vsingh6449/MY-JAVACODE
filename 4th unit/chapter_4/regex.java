package chapter_4;
public class regex {
    public static void main(String[] args) {
        String s = "Apple is my Fruit";
        String s1 = s.replaceAll("[aeiouAEIOU]", "*");
        String s2 = s1.replaceAll("[ ]","#");
        System.out.println(s2);
    }
    
}

