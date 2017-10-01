package learnGUI;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Student extends JFrame{
	
	private JTextField firstName;
	private JTextField lastName;
	private JTextField email;
	private JPasswordField password;
	private JTextField description;
	private JCheckBox boldCheck;
	private JCheckBox italicCheck;
	
	private JTextField country;
	private JRadioButton rdBold;
	private JRadioButton rdItalic;
	private ButtonGroup group;
	
	private JButton register;
	private JButton cancel;
	
	Font bold  = new Font("serif", Font.BOLD, 14 );
	Font italic  = new Font("serif", Font.ITALIC, 14 );
	Font italicBold  = new Font("serif", Font.ITALIC + Font.BOLD, 14 );
	Font plain  = new Font("serif", Font.PLAIN, 14 );
	
	public Student(){
		super("Student Profile");
		setLayout(new FlowLayout());
		
		firstName = new JTextField(10);
		add(firstName);
		
		lastName = new JTextField("Enter lastName here");
		add(lastName);
		
		email = new JTextField("eneditable", 20);
		email.setEditable(false);
		add(email);
		
		password = new JPasswordField("password");
		add(password);
		
		description = new JTextField(20);
		add(description);
		
		boldCheck = new JCheckBox("Bold");
		add(boldCheck);
		
		italicCheck = new JCheckBox("Italic");
		add(italicCheck);
		
		register = new JButton("Register Student");
		add(register);
		
		
		cancel = new JButton("Cancel Registration");
		add(cancel);
		
		country = new JTextField("Country");
		add(country);
		
		rdBold = new JRadioButton("Bold", true);
		add(rdBold);
		
		rdItalic = new JRadioButton("Italic", false);
		add(rdItalic);
		
		group = new ButtonGroup();
		group.add(rdBold);
		group.add(rdItalic);
		
		LocalEventHandler handler = new LocalEventHandler();
		
		firstName.addActionListener(handler);
		lastName.addActionListener(handler);
		email.addActionListener(handler);
		password.addActionListener(handler);
		register.addActionListener(handler);
		cancel.addActionListener(handler);
		
		localEventChangeHandler eventChangeHandler = new localEventChangeHandler();
		italicCheck.addItemListener(eventChangeHandler);
		boldCheck.addItemListener(eventChangeHandler);
		
		
		
		
		rdBold.addItemListener(new localEventChangeHandler(bold));
		rdItalic.addItemListener(new localEventChangeHandler(italic));
		
		
		
		
			
		
	}
	
	private class localEventChangeHandler implements ItemListener{

		private Font font;
		public localEventChangeHandler(Font f){
			font = f;
		}
		
		private localEventChangeHandler() {};
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getSource() == rdBold || e.getSource() == rdItalic) country.setFont(font);
			
			if (e.getSource()== italicCheck || e.getSource() == boldCheck) 
				{
				if(italicCheck.isSelected()) description.setFont(italic);
				if(boldCheck.isSelected()) description.setFont(bold);
				if(boldCheck.isSelected() && italicCheck.isSelected()) description.setFont(italicBold);
				if(!boldCheck.isSelected() && !italicCheck.isSelected()) description.setFont(plain);
				
				}
		}
		
		
		
	}
	
	private class LocalEventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String string = "";
			
			if(e.getSource() == firstName)
				string=String.format("Student first name is %s", e.getActionCommand());
			else if(e.getSource() == lastName)
				string=String.format("Student last name is %s", e.getActionCommand());
			else if(e.getSource() == email)
				string=String.format("Student email is %s", e.getActionCommand());
			else if(e.getSource() == password)
				string=String.format("Student password is %s", e.getActionCommand());
			else if (e.getSource()==register)
				string=String.format("%s registration is in progress", e.getActionCommand());
			else if(e.getSource() == cancel)
				string= String.format("%s Registration Cancelled", e.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
		
	}
}
