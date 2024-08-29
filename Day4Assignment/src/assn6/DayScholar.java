package assn6;

public class DayScholar extends Student
{
	private String residentialAddress;
	
	public void setResAddress(String address) {
		this.residentialAddress=address;
	}
	public void getDetails()
	{
		super.getDetails();
		System.out.println("Student Name: "+studentName);
		System.out.println("Residential Address: "+residentialAddress);
	}
	
}
