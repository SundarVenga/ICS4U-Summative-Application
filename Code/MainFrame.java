package mainFrame;

import java.awt.EventQueue;
import java.awt.*;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame{

	static JFrame frame;
	private JTextField txtCellcearch;
	private JTextField txtOnePlaceFor;
	private JTextArea txtrWhatTypeOf;
	private JTextArea txtrWhatType;
	private JComboBox planPick;
	private JTextArea txtrDoYouNeed;
	private JComboBox tabPick;

	/**
	 * Launch the application.
	
	 */
	public static void main(String[] args) {
		
		//Splash Screen
		LoadScreen ls = new LoadScreen();
		ls.setVisible(true);
		try {
			Thread.sleep(5000);
			ls.dispose();
		}
		catch(InterruptedException e2) {
			e2.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}
	String budget;
	String plan;
	String tab;
	static int count;
	
	/**
	 * Method sets value to variable count depending on selections from drop down menu
	 */
	public void checker() {
		if(budget == "Below $50") {
			if(plan == "Data + Talk + Text") {
				if(tab == "Yes") {
					count = 1;
				}
				else {
					count = -1;
				}
			}
			if(plan == "Data Only") {
				if(tab == "Yes") {
					count = 2;
				}
				else {
					count = -2;
				}
			}
			if(plan == "Talk + Text") {
				if(tab == "Yes") {
					count = 3;
				}
				else {
					count = -3;
				}
			}
		}
		
		if(budget == "$50 - $90") {
			if(plan == "Data + Talk + Text") {
				if(tab == "Yes") {
					count = 4;
				}
				else {
					count = -4;
				}
			}
			if(plan == "Data Only") {
				if(tab == "Yes") {
					count = 5;
				}
				else {
					count = -5;
				}
			}
			if(plan == "Talk + Text") {
				if(tab == "Yes") {
					count = 6;
				}
				else {
					count = -6;
				}
			}
		}
		
		if(budget == "$90 - $130") {
			if(plan == "Data + Talk + Text") {
				if(tab == "Yes") {
					count = 7;
				}
				else {
					count = -7;
				}
			}
			if(plan == "Data Only") {
				if(tab == "Yes") {
					count = 8;
				}
				else {
					count = -8;
				}
			}
			if(plan == "Talk + Text") {
				if(tab == "Yes") {
					count = 9;
				}
				else {
					count = -9;
				}
			}
		}
		
		if(budget == "$130+") {
			if(plan == "Data + Talk + Text") {
				if(tab == "Yes") {
					count = 10;
				}
				else {
					count = -10;
				}
			}
			if(plan == "Data Only") {
				if(tab == "Yes") {
					count = 11;
				}
				else {
					count = -11;
				}
			}
			if(plan == "Talk + Text") {
				if(tab == "Yes") {
					count = 12;
				}
				else {
					count = -12;
				}
			}
		}
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Text Fields for Company name and slogan
		txtCellcearch = new JTextField();
		txtCellcearch.setEditable(false);
		txtCellcearch.setFont(new Font("Charlemagne Std", Font.BOLD, 30));
		txtCellcearch.setHorizontalAlignment(SwingConstants.CENTER);
		txtCellcearch.setText("CellCearch");
		txtCellcearch.setBounds(157, 6, 237, 61);
		frame.getContentPane().add(txtCellcearch);
		txtCellcearch.setColumns(10);
		
		txtOnePlaceFor = new JTextField();
		txtOnePlaceFor.setEditable(false);
		txtOnePlaceFor.setHorizontalAlignment(SwingConstants.CENTER);
		txtOnePlaceFor.setText("One Place for all your cell plans");
		txtOnePlaceFor.setBounds(167, 62, 210, 26);
		frame.getContentPane().add(txtOnePlaceFor);
		txtOnePlaceFor.setColumns(10);
		
		//Drop down menus
		JTextArea txtrWhatIsYour = new JTextArea();
		txtrWhatIsYour.setEditable(false);
		txtrWhatIsYour.setText("What is your \nmonthly budget?");
		txtrWhatIsYour.setBounds(25, 217, 129, 40);
		frame.getContentPane().add(txtrWhatIsYour);
		
		JComboBox budgetPick = new JComboBox();
		budgetPick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JComboBox cb = (JComboBox)e.getSource();
				budget = (budgetPick.getSelectedItem()).toString();
			}
		}); 
		budgetPick.setModel(new DefaultComboBoxModel(new String[] {"Choose", "Below $50", "$50 - $90", "$90 - $130", "$130+"}));
		budgetPick.setToolTipText("");
		budgetPick.setBounds(25, 269, 129, 26);
		frame.getContentPane().add(budgetPick);
		Image img = new ImageIcon(this.getClass().getResource("/bg1.jpg")).getImage();
		
		txtrWhatTypeOf = new JTextArea();
		txtrWhatTypeOf.setText("What type of\nplan do you\nprefer?");
		txtrWhatTypeOf.setEditable(false);
		txtrWhatTypeOf.setBounds(206, 196, 129, 61);
		frame.getContentPane().add(txtrWhatTypeOf);
		
		txtrWhatType = new JTextArea();
		txtrWhatType.setText("What type");
		txtrWhatType.setBounds(266, 160, -72, 16);
		frame.getContentPane().add(txtrWhatType);
		
		planPick = new JComboBox();
		planPick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JComboBox cb = (JComboBox)e.getSource();
				plan = (planPick.getSelectedItem()).toString();
			}
		});
		planPick.setModel(new DefaultComboBoxModel(new String[] {"Choose", "Data + Talk + Text", "Data Only", "Talk + Text"}));
		planPick.setToolTipText("");
		planPick.setBounds(206, 269, 129, 26);
		frame.getContentPane().add(planPick);
		
		txtrDoYouNeed = new JTextArea();
		txtrDoYouNeed.setText("Do you need\na cellphone\nto come with\nthe plan?");
		txtrDoYouNeed.setEditable(false);
		txtrDoYouNeed.setBounds(392, 184, 129, 71);
		frame.getContentPane().add(txtrDoYouNeed);
		
		tabPick = new JComboBox();
		tabPick.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JComboBox cb = (JComboBox)e.getSource();
				tab = (tabPick.getSelectedItem()).toString();
			}
		});
		tabPick.setModel(new DefaultComboBoxModel(new String[] {"Choose", "Yes", "No"}));
		tabPick.setToolTipText("");
		tabPick.setBounds(392, 269, 129, 26);
		frame.getContentPane().add(tabPick);
		
		//continue button
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
			
			checker();
			if(count<=12) {
				MainFrame.frame.dispose();
				Plans pln = new Plans();
				pln.setVisible(true);
			}

			}
		});
		btnContinue.setBounds(206, 338, 117, 29);
		frame.getContentPane().add(btnContinue);
		
		//bg image
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(img));
		label.setBounds(6, 6, 538, 416);
		frame.getContentPane().add(label);
	}
}
