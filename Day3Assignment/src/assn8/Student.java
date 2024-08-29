package assn8;

public class Student 
{
	int studentId;
	String studentName;
	String residentialStatus;
	long feesPerMonth;
	long hostelFees;
	char studentType;
	public Student(){}
	
	public Student(int studentId, char studentType, String firstName, String lastName)
	{
		this.studentId=studentId;
		this.studentType=studentType;
		this.studentName=firstName+" "+lastName;
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
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	public void calculateFees(double semesterFees)
	{
		feesPerMonth=(long) (semesterFees/6.0);
		System.out.println(feesPerMonth);
	}
	
	public void calculateFees(double semesterFees, double hostelFees)
	{
		feesPerMonth=(long) (semesterFees/6.0);
		feesPerMonth=(long) (feesPerMonth+hostelFees);
		System.out.println(feesPerMonth);
	}
	
	public static void main(String args[])
	{
		Student student=new Student(101,'M',"Bhavya","Nagpal");
		student.setResidentialStatus("Hostelite");
		if(student.getResidentialStatus()=="Hostelite")
		{
			student.setHostelFeesPerMonth(1250);
		}
		student.setFeesPerMonth(10000);
		if(student.getResidentialStatus()=="Hostelite")
		student.calculateFees(student.getFeesPerMonth(),student.getHostelFeesPerMonth());
		else
		student.calculateFees(student.getFeesPerMonth());
	}
		
	
}

