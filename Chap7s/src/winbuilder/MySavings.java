/*

Program: AccountSetup.java          Last Date of this Revision: April 27, 2022

Purpose: An application that acts like a bank.

Author: Ali Al-sebbah, 
School: CHHS
Course: Computer Programming 20
 

*/


package winbuilder;

import java.awt.EventQueue;


import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JOptionPane;


public class MySavings {

	private static final AbstractButton Total = null;
	private static float Object;
	private JFrame frame;
	
	PiggyBank pb = new PiggyBank();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MySavings window = new MySavings();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MySavings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bank");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel.setBounds(10, 11, 298, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please choos an option below:");
		lblNewLabel_1.setBounds(10, 68, 220, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
        JRadioButton Total = new JRadioButton("Total");
		Total.setBounds(10, 89, 109, 23);
		frame.getContentPane().add(Total);
		
		JRadioButton Penny = new JRadioButton("Add a penny");
		Penny.setBounds(10, 115, 109, 23);
		frame.getContentPane().add(Penny);
		
		JRadioButton nickel = new JRadioButton("Add a nickel");
		nickel.setBounds(10, 141, 109, 23);
		frame.getContentPane().add(nickel);
		
		JRadioButton quarter = new JRadioButton("Add a quarter");
		quarter.setBounds(121, 89, 109, 23);
		frame.getContentPane().add(quarter);
		
		JRadioButton withdrawl = new JRadioButton("Withdrawl");
		withdrawl.setBounds(121, 115, 109, 23);
		frame.getContentPane().add(withdrawl);
		
		JRadioButton quit = new JRadioButton("Quit");
		quit.setBounds(121, 141, 109, 23);
		frame.getContentPane().add(quit);
		
		
		  JLabel dis = new JLabel("New label");
		    dis.setBounds(223, 174, 201, 56);
		    frame.getContentPane().add(dis);
		
		ButtonGroup group = new ButtonGroup();
	    group.add(Total);
	    group.add(Penny);
	    group.add(nickel);
	    group.add(quarter);
	    group.add(withdrawl);
	    group.add(quit);
	    
	    JButton btnNewButton = new JButton("Click!");
	    btnNewButton.addActionListener(new ActionListener() 
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		
	    		
	    		if(Total.isSelected())
	    		{
	    			dis.setText(Double.toString(pb.giveTotal()));
	    			
	    		}
	    		else if(Penny.isSelected())
	    		{
	    			pb.addCoin(0.01);
	    		}
	    		else if(nickel.isSelected())
	    		{
	    			pb.addCoin(0.05);
	    		}
	    		else if(quarter.isSelected())
	    		{
	    			pb.addCoin(0.25);
	    		}
	    		else if (withdrawl.isSelected())
	    			
	    			pb.withdrawl(0.25);
	    		{
	    		
	    		}
	    	}
	    	
	    	
	    		
	    		
	    	
	    	
	    		    });
	    btnNewButton.setBounds(42, 191, 89, 23);
	    frame.getContentPane().add(btnNewButton);
	    
	  
	    
	
/*
	    Total.addActionListener((ActionListener) this);
	    Penny.addActionListener((ActionListener) this);
	    nickel.addActionListener((ActionListener) this);
	    quarter.addActionListener((ActionListener) this);
	    withdrawl.addActionListener((ActionListener) this);
	    withdrawl.addActionListener((ActionListener) this);
	    */
	
	    
	   
	    
	  
       
	    
	     

  
      
       
        
    
	    	    
	    		
	            
	    
	    	
		
	
		
	}
}
