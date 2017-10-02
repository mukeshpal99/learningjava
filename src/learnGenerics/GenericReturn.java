package learnGenerics;

public class GenericReturn {
	
	
	public static void main(String[] args){
		
		System.out.println(max(45,98,34));
		System.out.println(max("acd", "tt", "bbbb"));
		
	}
	
	
	// generic method to compare three values
	public static <T extends Comparable<T>> T max(T a, T b, T c){
		
		T max = a;
		if(b.compareTo(a) > 0) max=b;
		
		if(c.compareTo(max)> 0)  max=c;
	
		return max;
	}

}
