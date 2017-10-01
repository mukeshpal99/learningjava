package learnEnum;

import java.util.EnumSet;
import java.util.Set;

public enum Direction {
	
	EAST,
	WEST,
	NORTH,
	SOUTH;
	
	public static final Set<Direction> GOOD_DIRECTION = EnumSet.of(EAST, WEST);
	public static final Set<Direction> BAD_DIRECTION = EnumSet.of(NORTH, SOUTH);
	
}
