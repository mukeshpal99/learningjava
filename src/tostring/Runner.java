package tostring;

public class Runner {
	
	public static void main(String[] args)
	{
		BirthDate birthdate = new BirthDate(27, 03, 1986);
		Student student= new Student("Rajesh", birthdate);
		
		System.out.println(student);
	}
	
	

}
