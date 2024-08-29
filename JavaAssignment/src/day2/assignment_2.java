package day2;

public class assignment_2 
{
	public static void main1()
	{
		boolean bool=true;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(j+"\t");
				if(j>5)
				break;
			}
			System.out.println("outer loop");
		}
		System.out.println("end");
	}
	
	public static void main2()
	{
		boolean bool=true;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(j+"\t");
				if(j>5)
				{
					System.out.println();
					continue;
				}
			}
			System.out.println("outer loop");
		}
		System.out.println("end");
	}
	
	public static void main(String args[])
	{
		main1();
		System.out.println("------");
		main2();
	}
}
