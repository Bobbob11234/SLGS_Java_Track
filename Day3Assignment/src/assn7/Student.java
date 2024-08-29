package assn7;

public class Student 
{
	int studentId;
	String studentName;
	String residentialStatus;
	long feesPerMonth;
	long hostelFees;
	public Student()
	{
		
	}
//	public Student(int studentId, String studentName, String residentialStatus, long feesPerMonth) {
//		super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.residentialStatus = residentialStatus;
//		this.feesPerMonth = feesPerMonth;
//	}
//	public Student(int studentId, String studentName, String residentialStatus, long feesPerMonth, long hostelFees) {
//		super();
//		this.studentId = studentId;
//		this.studentName = studentName;
//		this.residentialStatus = residentialStatus;
//		this.feesPerMonth = feesPerMonth;
//		this.hostelFees=hostelFees;
//	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName+" "+lastName;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public long getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	public long getHostelFeesPerMonth() {
		return hostelFees;
	}
	public void setHostelFeesPerMonth(long hostelFees) {
		this.hostelFees = hostelFees;
	}
	
	public static void main(String args[])
	{
		int id=Integer.parseInt(args[0]);
		String firstName=args[1];
		String lastName=args[2];
		String status=args[3];
		long fees=Long.parseLong(args[4]);
		if(status=="Hostelite")
		{
			long hostelFees=Long.parseLong(args[5]);
			Student student=new Student();
			student.setStudentId(id);
			student.setStudentName(args[1],args[2]);
			student.setResidentialStatus(status);
			student.setFeesPerMonth(fees);
			student.setHostelFeesPerMonth(hostelFees);
			
			System.out.println(student.getStudentName());
		}
		else
		{	
			Student student=new Student();
			student.setStudentId(id);
			student.setStudentName(firstName,lastName);
			student.setResidentialStatus(status);
			student.setFeesPerMonth(fees);
			
			System.out.println(student.getStudentName());
		}
		
		
	}
		
	
}

