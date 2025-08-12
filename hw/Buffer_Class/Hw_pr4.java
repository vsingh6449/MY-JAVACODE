public class Hw_pr4 {
    public static void main(String[] args) {
        String str = "Consistency is the key";
        StringBuffer sb = new StringBuffer(str);
        sb.ensureCapacity(30);
        System.out.println("Before append Capacity :" +sb.capacity());
        sb.append("to long term success");
        
        System.out.println(" append Capacity :" +sb.capacity());
        sb.ensureCapacity(159);
        System.out.println("After append Capacity :" +sb.capacity());
    }    
}
