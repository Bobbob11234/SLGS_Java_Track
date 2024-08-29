package assn4;

public class StringClass 
{
	public static void main(String args[])
	{
		String name=args[0];
		System.out.println(name.length());
		System.out.println("Hi "+name);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		char ch=args[0].charAt(0);
		if(ch=='A')
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}
