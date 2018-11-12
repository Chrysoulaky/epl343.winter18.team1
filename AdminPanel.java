package epl361_FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class AdminPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPanel frame = new AdminPanel();
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
	public AdminPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminpanel = new JLabel("AdminPanel");
		lblAdminpanel.setFont(new Font("Tahoma",  Font.ITALIC, 16));
		lblAdminpanel.setBounds(134, 21, 136, 47);
		contentPane.add(lblAdminpanel);
		
		JButton btnNewButton = new JButton("View Webpage");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
			         String url = "http://eriakouppari97.mozello.com/";
			         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
			       }
			       catch (java.io.IOException ex) {
			           System.out.println(ex.getMessage());
			       }
			}
		});
		btnNewButton.setBounds(102, 75, 199, 48);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Notifications");
		button.setBounds(102, 134, 199, 48);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Search");
		button_1.setBounds(102, 190, 199, 48);
		contentPane.add(button_1);
		
	
			
		JButton button_2 = new JButton("Information");		
		button_2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Information info = new Information();		
				info.setVisible(true);
			}
						
		});
		
		
		button_2.setBounds(102, 249, 199, 48);
		contentPane.add(button_2);
	}
}
