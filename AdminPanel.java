package Project;

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
import java.awt.Color;
import java.awt.SystemColor;
public class AdminPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 *
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
		setBounds(100, 100, 725, 478);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("View Webpage");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
	
			//public void actionPerformed(ActionEvent e) {
			btnNewButton.addActionListener(new ActionListener() {	
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Webpage info = new Webpage();		
						info.setVisible(true);
					}
				});
				
				/*try { 
			         String url = "http://eriakouppari97.mozello.com/";
			         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
			       }
			       catch (java.io.IOException ex) {
			           System.out.println(ex.getMessage());
			       }*/
		
		btnNewButton.setBounds(82, 211, 199, 48);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Notifications");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Notifications nots=new Notifications();
				nots.setVisible(true);
			}
		});
		button.setBounds(407, 211, 199, 48);
		contentPane.add(button);

		
	
			
		JButton button_2 = new JButton("Information");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBounds(407, 278, 199, 48);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {	
				Information info = new Information();		
				info.setVisible(true);
			}					
		});
		
		
		JButton exit_button = new JButton("Exit");
		exit_button.setFont(new Font("Tahoma", Font.BOLD, 11));
		exit_button.setBounds(293, 368, 113, 44);
		exit_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(1);
			}
		});
		contentPane.add(exit_button);
		
		JButton btnNewButton_1 = new JButton("Statistics");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statistics stats = new Statistics();
				stats.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(82, 280, 199, 44);
		contentPane.add(btnNewButton_1);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("U:\\EPL343_361\\project\\src\\logo.png"));
		lblLogo.setBounds(10, 11, 671, 189);
		contentPane.add(lblLogo);

			}
		}
