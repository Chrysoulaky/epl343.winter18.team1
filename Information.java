package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Information extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Information frame = new Information();
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
	public Information() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 298);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfo = new JLabel("Information");
		lblInfo.setBounds(157, 11, 136, 47);
		lblInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		contentPane.add(lblInfo);
		
		JButton btnNewButton = new JButton("Customers");
		btnNewButton.setBounds(30, 151, 136, 47);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {			
						Find_Customer info = new Find_Customer();		
						info.setVisible(true);			
			}
		});
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Collaborators");
		button.setBounds(240, 75, 136, 47);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				Collaborator_Form info = new Collaborator_Form();		
				info.setVisible(true);
			}
			
		});
		
		JButton button_1 = new JButton("Employees");
		button_1.setBounds(30, 75, 136, 47);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				EmployeesForm info = new EmployeesForm();		
				info.setVisible(true);
			}
		});
		
		
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(341, 238, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(1);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("< Go Back");
		btnNewButton_2.setBounds(0, 238, 109, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				AdminPanel adminP = new AdminPanel();		
				adminP.setVisible(true);
				
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnProperties = new JButton("Properties");
		btnProperties.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Properties_types pro=new Properties_types();
				pro.setVisible(true);
			}
		});
		btnProperties.setBounds(240, 151, 136, 47);
		contentPane.add(btnProperties);
		

		
		
	}
}
