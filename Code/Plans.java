package mainFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Plans extends JFrame{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plans frame = new Plans();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Plans() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		if(MainFrame.count == 1) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Fido\nData: Pay Per Use (Roam included)\nCalling: 500 Canada-Wide Mins\nTexting: Unlimited\nPhone: Huawei P20 Lite (Upgradeable)\nPrice: $45/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
			
			JTextArea txtrOption2 = new JTextArea();
			txtrOption2.setText("Option 2: Fido\nData: Pay Per Use (Roam included)\nCalling: 500 Canada-Wide Mins\nTexting: Unlimited\nPhone: LG G6 (Upgradeable)\nPrice: $45/mo\n");
			txtrOption2.setEditable(false);
			txtrOption2.setBounds(160, 254, 278, 98);
			contentPane.add(txtrOption2);
		}
		if(MainFrame.count == -1) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Fido\nData: Pay Per Use (Roam included)\nCalling: 500 Canada-Wide Mins\nTexting: Unlimited\nPhone: None\nPrice: $35/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		if(MainFrame.count == 2) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Rogers\nData: 1 GB\nCalling: N/A\nTexting: N/A\nPhone: Tablet\nPrice: $10/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		if(MainFrame.count == -2) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Rogers\nData: Share everything 14 GB total\nCalling: N/A\nTexting: N/A\nPhone: Multiple Devices\nPrice: $100 divided by devices/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		
		if(MainFrame.count == 3) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Fido\nData: N/A\nCalling: 500 Canada-Wide Mins\nTexting: Unlimited\nPhone: Huawei P20 Lite\nPrice: $35/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		if(MainFrame.count == -3) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Fido\nData: Pay Per Use (Roam included)\nCalling: 500 Canada-Wide Mins\nTexting: Unlimited\nPhone: None\nPrice: $35/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		
		if(MainFrame.count == 4) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Fido\nData: 2GB (Roam included)\nCalling: Unlimited Canada-Wide Mins\nTexting: Unlimited\nPhone: Huawei P20 Lite\nPrice: $65/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
			
			JTextArea txtrOption2 = new JTextArea();
			txtrOption2.setText("Option 2: Rogers\nData: 4GB\nCalling: Unlimited Local Mins\nTexting: Unlimited\nPhone: iPhone 8\nPrice: $85/mo\n");
			txtrOption2.setEditable(false);
			txtrOption2.setBounds(160, 254, 278, 98);
			contentPane.add(txtrOption2);
		}
		if(MainFrame.count == -4) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Fido\nData: 4GB\nCalling: Unlimited Local Mins\nTexting: Unlimited\nPhone: None\nPrice: $80/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		
		if(MainFrame.count == 5) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Not in Price Range");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		if(MainFrame.count == -5) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Not in Price Range");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		
		if(MainFrame.count == 6) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Not in Price Range");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		if(MainFrame.count == -6) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Not in Price Range");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		
		if(MainFrame.count == 7) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Fido\nData: 2GB (Roam included)\nCalling: Unlimited Canada-Wide Mins\nTexting: Unlimited\nPhone: Huawei P20 Lite\nPrice: $65/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
			
			JTextArea txtrOption2 = new JTextArea();
			txtrOption2.setText("Option 2: Rogers\nData: 4GB\nCalling: Unlimited Local Mins\nTexting: Unlimited\nPhone: iPhone 8\nPrice: $85/mo\n");
			txtrOption2.setEditable(false);
			txtrOption2.setBounds(160, 254, 278, 98);
			contentPane.add(txtrOption2);
		}
		if(MainFrame.count == -7) {
			JTextArea txtrOption = new JTextArea();
			txtrOption.setEditable(false);
			txtrOption.setText("Option 1: Fido\nData: 4GB\nCalling: Unlimited Local Mins\nTexting: Unlimited\nPhone: None\nPrice: $80/mo\n");
			txtrOption.setBounds(160, 122, 278, 98);
			contentPane.add(txtrOption);
		}
		Image img3 = new ImageIcon(this.getClass().getResource("/plansBg.jpg")).getImage();
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame.frame.setVisible(true);
				//Plans pln = new Plans();
				//pln.dispose();
			}
		});
		btnBack.setBounds(374, 358, 117, 29);
		contentPane.add(btnBack);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(img3));
		label.setBounds(6, 6, 538, 416);
		contentPane.add(label);
	}
}
