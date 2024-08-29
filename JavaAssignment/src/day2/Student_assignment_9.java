package day2;

public class Student_assignment_9 
{
	static int id=550;
	int studentId;
	char studentType;
	String studentName;
	public Student_assignment_9()
	{
		this.studentId=id++;
	}
	public Student_assignment_9(char type, String first, String last)
	{
		this();
		this.studentType=type;
		this.studentName=first+" "+last;
	}
	public void displayDetails(Student_assignment_9 student)
	{
		System.out.println("Id: "+this.studentId);
		System.out.println("Name: "+this.studentName);
		System.out.println("Type: "+this.studentType);
	}
	
	public static void main(String args[])
	{
		Student_assignment_9 studentOne=new Student_assignment_9('D',"Bony","Thomas");
		studentOne.displayDetails(studentOne);
		Student_assignment_9 studentTwo=new Student_assignment_9('H',"Dinil","Bose");
		studentTwo.displayDetails(studentTwo);
	}
}
