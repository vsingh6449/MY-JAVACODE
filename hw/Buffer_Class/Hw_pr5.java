public class Hw_pr5 {
    public static void main(String[] args) {
        String str = "Apple is ";
        StringBuffer sb = new StringBuffer(str);
        sb.append("sweet");
        sb.setLength(7);
        System.out.print(sb.toString());
    }
    
}
