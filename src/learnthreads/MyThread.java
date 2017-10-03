package learnthreads;

import java.util.Random;

public class MyThread implements Runnable{

	String name;
	int time;
	
	Random random = new Random();
	
	public MyThread(String thredName){
		this.name=thredName;
		this.time= random.nextInt(999);
	}
	

	@Override
	public void run() {
		
		try{
			System.out.printf("%s is sleeping for %d miliseconds\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s is done\n", name);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
