package assn2;

public class Registration 
{
	public static void main(String args[])
	{
		DayScholar dayScholar=new DayScholar();
		dayScholar.setStudent(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Dinil");
		dayScholar.getDetails();
	}
}
