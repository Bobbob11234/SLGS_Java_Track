package assn2;

public class DayScholar extends Student
{
	private String residentialAddress;
	public void setResAddress(String resAddress)
	{
		this.residentialAddress=resAddress;
	}
	public void getDetails() {
		System.out.println("Student Id "+studentId);
		System.out.println("Student Type: "+studentType);
		System.out.println("Student Name: "+studentName);
	}
}
