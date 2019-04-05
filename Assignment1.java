class Assignment1
{
	public int a,b,c;                              //declaration
	protected int x,y,z;
	private static float price = 100;
	void add()                                     //method
	{
		a=10; b=20;                            //initialization  

		int c = a+b;
		System.out.println("Addition = "+c);
	}
	void subtract()
	{
		x=20; y=10;                            //initialization  

		int z = x-y;
		System.out.println("Substraction = "+z);
	}
	void conversion()
	{
		String d = "20";
		c = Integer.parseInt(d);		//conversion
		System.out.println("AfterConversion = "+c);
	}
	void typeCast()
	{
		short i = 10;
		int j = 20;
		j = (short)i;
		System.out.println("AfterTypeCast = "+j);
	}
	public static void main(String args[])
	{
		Assignment1 obj= new Assignment1();     
		obj.add();                              //call to method	
		obj.conversion();	
		obj.subtract();
		obj.typeCast();
		System.out.println("Static data members = "+price);			
	}

}