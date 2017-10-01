package tostring;

public class Student {
	
	private String name;
	private BirthDate birthdate;
	
	public Student(String name, BirthDate birthdate)
	{
		this.name = name;
		this.birthdate = birthdate;
							
	}
	
	public String toString()
	{
		return String.format("my name is %s, my birthday is %s", name, birthdate);
	}
}
