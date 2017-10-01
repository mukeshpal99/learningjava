package learnEnum;

public class Runner {
	
	public static void main (String[] args)
	{
		for(Direction direction: Direction.values())
		{
			System.out.println(direction);
		}
		
		
		System.out.println(Direction.GOOD_DIRECTION);
		System.out.println(Direction.BAD_DIRECTION);
	}

}
