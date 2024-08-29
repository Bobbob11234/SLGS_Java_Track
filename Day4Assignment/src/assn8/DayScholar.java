package assn8;

public class DayScholar extends Student
{
	public String residentialAddress;
	public DayScholar() {};
	public DayScholar(int id, char type, String firstName, String lastName, double fees, String address)
	{
		super(id,type,firstName,lastName);
		super.feesPerMonth=fees;
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
	
	public void calculateFees(double semesterFees)
	{
		feesPerMonth=semesterFees/6.0;
	}
}
