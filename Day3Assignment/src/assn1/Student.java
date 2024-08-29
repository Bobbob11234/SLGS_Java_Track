package assn1;

public class Student 
{
	static int id;
	static int studentCount=500;
	int studentId;
	char studentType;
	String studentName;
	
	static {
		studentCount+=10;
	}
	
	public Student()
	{
		this.studentCount+=1;
		this.studentId=studentCount;
	}
	public Student(char type, String first, String last)
	{
		this();
		this.studentType=type;
		this.studentName=first+" "+last;
	}
	public void displayDetails(Student student)
	{
		System.out.println("Id: "+this.studentId);
		System.out.println("Name: "+this.studentName);
		System.out.println("Type: "+this.studentType);
	}

	public static void main(String args[])
	{
		Student studentOne=new Student('D',"Bony","Thomas");
		studentOne.displayDetails(studentOne);
		Student studentTwo=new Student('H',"Dinil","Bose");
		studentTwo.displayDetails(studentTwo);
	}
	
	public static int getStudentCount()
	{
		return studentCount;
	}
}

