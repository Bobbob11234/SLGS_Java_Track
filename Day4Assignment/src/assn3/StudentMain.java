package assn3;

public class StudentMain 
{
	public static void main(String args[])
	{
		Student student;
		String status=args[0];
		System.out.println(status);
		if(status.equals("Hostelite"))
		{
			student=new Hostelite(101,'M',"Bhavya","Nagpal",10000,"A",201);
			student.displayStudentDetails();
		}
		else
		{
			student=new DayScholar(102,'F',"Gauri","Nagpal",10000,"Whitefield, Bangalore");
			student.displayStudentDetails();
		}
	}
}
