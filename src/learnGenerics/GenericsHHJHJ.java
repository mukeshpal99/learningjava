package learnGenerics;

public class GenericsHHJHJ {

	public static void main(String[] args){
		
		Integer[] iray = {1,2,3,4, 5};
		Character[] cray = {'a','b','c','d','e'};
		
		printMe(iray);
		printMe(cray);
	}
	
//	public static void printMe(Integer[] i){
//		for(Integer x: i) System.out.printf("%s ", x);
//		System.out.println();
//	}
//	
//	public static void printMe(Character[] c){
//		for(Character x: c) System.out.printf("%s ", x);
//	}
	
	
	//generic method to elemicate above two methods
	
	public static <T> void printMe(T[] x){
		for(T b: x) System.out.printf("%s ", b);
		System.out.println();
	}
	
	
}
