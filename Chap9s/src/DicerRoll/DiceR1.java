package DicerRoll;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import DicerRoll.DiceRollerM;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class DiceR1 {

	protected static final double Roll1 = 0;
	private JFrame frame;
	private JTextField txtDiceRoll;
	private JTextField txtP;
	
	DiceRollerM DC = new DiceRollerM();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceR1 window = new DiceR1();
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
	public DiceR1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDiceRoll = new JTextField();
		txtDiceRoll.setForeground(Color.BLACK);
		txtDiceRoll.setBackground(Color.WHITE);
		txtDiceRoll.setFont(new Font("Tahoma", Font.PLAIN, 28));
		txtDiceRoll.setText("Dice Roll");
		txtDiceRoll.setBounds(10, 11, 175, 56);
		frame.getContentPane().add(txtDiceRoll);
		txtDiceRoll.setColumns(10);
		
		txtP = new JTextField();
		txtP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtP.setText("Choose how many rolls you want.");
		txtP.setForeground(Color.BLACK);
		txtP.setBackground(Color.LIGHT_GRAY);
		txtP.setBounds(10, 78, 211, 20);
		frame.getContentPane().add(txtP);
		txtP.setColumns(10);
		
		JRadioButton B1= new JRadioButton("1");
		B1.setBounds(10, 114, 109, 23);
		frame.getContentPane().add(B1);
		
		JRadioButton B2 = new JRadioButton("2\r\n");
		B2.setBounds(152, 114, 109, 23);
		frame.getContentPane().add(B2);
		
		JRadioButton B3 = new JRadioButton("3");
		B3.setBounds(10, 155, 109, 23);
		frame.getContentPane().add(B3);
		
		JRadioButton B4 = new JRadioButton("4");
		B4.setBounds(152, 155, 109, 23);
		frame.getContentPane().add(B4);
	

		JLabel lbl = new JLabel("New label");
		lbl.setBounds(109, 203, 137, 14);
		frame.getContentPane().add(lbl);
		
		JLabel lb2 = new JLabel("New label");
		lb2.setBounds(304, 28, 109, 189);
		frame.getContentPane().add(lb2);
		
		
		ButtonGroup group = new ButtonGroup();
	    group.add(B1);
	    group.add(B2);
	    group.add(B3);
	    group.add(B4);
	
		
		JButton CLK = new JButton("Click!!");
		CLK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(B1.isSelected())
	    		{
	    			lbl.setText("Rolling three dice once!");
	    			
	    			lb2.setText(Double.toString(DC.RollD()));
	    		}
				
				if(B2.isSelected()) {

					lbl.setText("Rolling three dice twice!");
	    			
	    			lb2.setText(Double.toString(DC.RollD2()));
				}
				
				if(B3.isSelected()) {

					lbl.setText("Rolling three dice three times!");
	    			
	    			lb2.setText(Double.toString(DC.RollD3()));
				}
				if(B4.isSelected()) {

					lbl.setText("Rolling three dice four times!");
	    			
	    			lb2.setText(Double.toString(DC.RollD3()));
				}
			}
	    			
				
				
				
			

			
			
		});
		CLK.setBounds(10, 199, 89, 23);
		frame.getContentPane().add(CLK);
		
		
	
		
	
	}
		}
