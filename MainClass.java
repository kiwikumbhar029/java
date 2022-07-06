class  Example
{
	static byte age=25;
	byte no=30;
	Example()
	{
		no=20;
		System.out.println("Construtor"+no);

	}
	public static void display1()
	{
		System.out.println("Static Method..."+age);
	
	}
		
	public byte display()
	{
		byte ab=5;
		System.out.println("Instance Method..."+age);
		return ab;
	}


}
class MainClass
{
	byte a=100;//class level variable,instance Variable
	static
	{
		System.out.println("Static block");
	}
	public static void main(String[] a)
	{
		Example E=new Example();	
		byte value=E.display();
		System.out.println(value);	
		Example.display1();
	
	}

}