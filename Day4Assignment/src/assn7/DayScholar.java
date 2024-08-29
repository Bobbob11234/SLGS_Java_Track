package assn7;

public class DayScholar extends Student
{
	private String residentialAddress;
	
	public DayScholar() {};
	public DayScholar(int id, char type, String firstName, String lastName, String address)
	{
		super.setStudentId(id);
		super.setStudentType(type);
		super.setStudentName(firstName,lastName);
		this.residentialAddress=address;
		
	}
	
	public void setResAddress(String address) {
		this.residentialAddress=address;
	}
	
	public void displayDaySDetails()
	{
		System.out.println(super.studentId);
		System.out.println(super.studentName);
		System.out.println(super.studentType);
		System.out.println(super.semesterFees);
		System.out.println(super.feesPerMonth);
	}
	
}
