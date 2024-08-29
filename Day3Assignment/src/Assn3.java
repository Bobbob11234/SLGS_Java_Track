
public class Assn3 
{
	public static void main(String args[])
	{
		String array[][]= {{"Thomas","JAVA","UNIX"},
							{"Tony","JAVA","C","C++"},
							{"Dinil","Linux","Oracle"},
							{"Delvin","RDBMS","C#","ORACLE"}};
		
		for(String arr[]:array)
		{
			if(arr[0]=="Delvin")
			{
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(arr[2]);
				System.out.println(arr[3]);
			}
		}
	}
}
