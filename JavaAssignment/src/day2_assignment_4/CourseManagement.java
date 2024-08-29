package day2_assignment_4;

public class CourseManagement 
{
	public static void main(String args[])
	{
		int id=101;
		char type='M';
		Student student=new Student();
		student.setStudentId(id);
		student.setStudentType(type);
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		
	}
}
