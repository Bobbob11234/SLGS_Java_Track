package assn5;

public class StudentMain 
{
	public static void main(String args[])
	{
		DayScholar dayscholar=new DayScholar(5,'D',"Manu",1001,"OOP",16000,"NO 32/3 Vijaynagar");
		dayscholar.calculateFees();
		System.out.println(dayscholar.getFees());
	}
}
