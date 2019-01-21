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
    	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}
  
  	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
		
		JTextArea txtrWhatIsYour = new JTextArea();
		txtrWhatIsYour.setEditable(false);
		txtrWhatIsYour.setText("What is your \nmonthly budget?");
		txtrWhatIsYour.setBounds(25, 217, 129, 40);
		frame.getContentPane().add(txtrWhatIsYour);
		
		txtrWhatTypeOf = new JTextArea();
		txtrWhatTypeOf.setText("What type of\nplan do you\nprefer?");
		txtrWhatTypeOf.setEditable(false);
		txtrWhatTypeOf.setBounds(206, 196, 129, 61);
		frame.getContentPane().add(txtrWhatTypeOf);
		
		txtrWhatType = new JTextArea();
		txtrWhatType.setText("What type");
		txtrWhatType.setBounds(266, 160, -72, 16);
		frame.getContentPane().add(txtrWhatType);
		
		txtrDoYouNeed = new JTextArea();
		txtrDoYouNeed.setText("Do you need\na cellphone\nto come with\nthe plan?");
		txtrDoYouNeed.setEditable(false);
		txtrDoYouNeed.setBounds(392, 184, 129, 71);
		frame.getContentPane().add(txtrDoYouNeed);
		
    }
