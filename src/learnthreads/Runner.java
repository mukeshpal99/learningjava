package learnthreads;

public class Runner {
	
	public static void main(String[] args){
		
		Thread t1= new Thread(new MyThread("Thread One"));
		Thread t2= new Thread(new MyThread("Thread Two"));
		Thread t3= new Thread(new MyThread("Thread Three"));
		Thread t4= new Thread(new MyThread("Thread Four"));
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	

}
