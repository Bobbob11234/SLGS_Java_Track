package assn3;

public class Example implements InterOne
{

	@Override
	public void methodOne() {
		//varTwo+=10;
		System.out.println("Value of varTwo: "+(varTwo+10));
		System.out.println("Good Morning");
		
		
	}

	@Override
	public void methodTwo() {
		System.out.println("Good Afternoon");
	}

}
