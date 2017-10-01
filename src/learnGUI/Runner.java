package learnGUI;

import javax.swing.JFrame;

public class Runner {
	
	public static void  main(String[] args){
		
		Student student =new Student();
		student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		student.setSize(350, 150);
		student.setVisible(true);
		
	}
	

}
