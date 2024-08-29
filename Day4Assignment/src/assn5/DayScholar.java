package assn5;

public class DayScholar extends PostGradStudent
{
	private String residentialAddress;
	private int fees;
	
	public DayScholar(int id, char type, String name, int cId, String cName, int cFees, String address)
	{
		super(id,type,name,cId,cName,cFees);
		residentialAddress=address;
	}
	public void calculateFees()
	{
		fees=this.getPostCourseFees()/6;
	}
	public int getFees()
	{
		return fees;
	}
}
