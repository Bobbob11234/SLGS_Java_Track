package assn2;

public class Hostelite extends Student
{
	String hostelName;
	int roomNumber;
	
	public Hostelite() {};
	
	public Hostelite(int id, char type, String firstName, String lastName, double fees, String hostel, int room)
	{
		super.studentId=id;
		super.studentType=type;
		super.studentName=firstName+lastName;
		super.feesPerMonth=fees;
		hostelName=hostel;
		roomNumber=room;
	}
	
	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public static void main(String args[])
	{
		Hostelite obj=new Hostelite(101,'M',"Bhavya","Nagpal",10000,"A",210);
		System.out.println(obj.getStudentId());
		System.out.println(obj.getStudentName());
		System.out.println(obj.getHostelName());
	}
}
