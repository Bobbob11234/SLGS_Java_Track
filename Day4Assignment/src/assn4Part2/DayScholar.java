package assn4Part2;

public class DayScholar extends Student
{
	private String residentialAddress;
	public DayScholar() {};
	public DayScholar(int id, char type, String firstName, String lastName, int fees, String address, String cName)
	{
		super(id,type,firstName,lastName,fees,cName);
		this.residentialAddress=address;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public void displayStudentDetails()
	{
		super.displayStudentDetails();
		System.out.println(this.getResidentialAddress());
	}
	
}
