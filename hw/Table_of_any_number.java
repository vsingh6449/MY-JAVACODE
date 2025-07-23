public class Table_of_any_number {
    public static void main(String[]args){
        System.out.println("Tables of 2 to 8");
        for(int i = 2;i<=8;i++){
            System.out.println("Table of " + i);
            System.out.println("-----------");
            for(int j=1; j<=10;j++){
                System.out.println(i+ "*"+j+"="+(i*j));

            }
            
        }
    }
    
}
