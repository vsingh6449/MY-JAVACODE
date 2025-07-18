class Data{
		int var1;
		int var2;
		
		public int multiply()
		{
			return var1*var2;
		}
		
		public int addition()
		{
			return var1+var2;
		}
}

 public class Unit2learn_2{	
	public static void main(String []args)
	{
		Data d1 = new Data();
		
		d1.var1 = 6;
		d1.var2 = 8;
			
		int x = d1.multiply();
		int y = d1.addition();
		System.out.println("Multiplication : " + x);
		System.out.println("Addition : " + y);
	}
}

