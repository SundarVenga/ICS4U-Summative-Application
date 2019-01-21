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
    }
