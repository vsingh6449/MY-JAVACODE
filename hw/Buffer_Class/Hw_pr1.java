public class Hw_pr1 {
    public static void main(String[]args){
    String str = "Welcome ";
    StringBuffer ss = new StringBuffer (str);
    ss.append("Java");          
    ss.insert(8,"Programming");     //Welcome Programming Java
    ss.replace(19,24," Python"); //Welcome Programming Python
    ss.reverse();
    String result = ss.toString();
    System.out.println(result);
    }  
}
