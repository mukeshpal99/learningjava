package tostring;

public class BirthDate {
	
	private int day;
	private int month;
	private int year;
	
	public BirthDate( int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
		
		System.out.printf("the constructor for this is %s\n", this);
	}
	
	public String toString()
	{
		return String.format("%d/ %d/ %d", day, month, year);
	}
	
	

}
