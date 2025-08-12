public class Hw_pr2 {
    public static void main(String[] args) {
        String str = "Python is Object Oriented Language hello";
        StringBuffer sb = new StringBuffer(str);
        sb.replace(0, 6,"Java");
        sb.delete(33,40 );
        System.out.println(sb.toString());
    }
    
}
