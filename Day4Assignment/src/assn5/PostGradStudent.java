package assn5;

public class PostGradStudent extends Student
{
	private int postCourseId;
	private String postCourseName;
	private int postCourseFees;
	
	public PostGradStudent(int id, char type, String name, int cId, String cName, int cFees)
	{
		super(id,type,name);
		postCourseId=cId;
		postCourseName=cName;
		postCourseFees=cFees;
	}
	public int getPostCourseId()
	{
		return postCourseId;
	}
	public String getPostCourseName()
	{
		return postCourseName;
	}
	public int getPostCourseFees() {
		return postCourseFees;
	}
	public void setPostCourseFees(int postCourseFees) {
		this.postCourseFees = postCourseFees;
	}
	public void setPostCourseId(int postCourseId) {
		this.postCourseId = postCourseId;
	}
	public void setPostCourseName(String postCourseName) {
		this.postCourseName = postCourseName;
	}
	
}
