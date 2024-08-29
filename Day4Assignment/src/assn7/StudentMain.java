package assn7;

public class StudentMain 
{
	public static void main(String args[])
	{
		DayScholar dayScholar=new DayScholar();
		dayScholar.setStudentId(101);
		dayScholar.setStudentName("Bhavya","Nagpal");
		dayScholar.setStudentType('A');
		dayScholar.calculateFees();
		dayScholar.displayDaySDetails();
	}
}
