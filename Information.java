package epl361_FinalProject;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfo = new JLabel("Informations");
		lblInfo.setFont(new Font("Tahoma",  Font.ITALIC, 16));
		lblInfo.setBounds(134, 21, 136, 47);
		contentPane.add(lblInfo);
		
		JButton btnNewButton = new JButton("Customers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(144, 89, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("Collaborators");
		button.setBounds(144, 144, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Employees");
		button_1.setBounds(144, 191, 89, 23);
		contentPane.add(button_1);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(1);
			}
		});
		btnNewButton_1.setBounds(345, 238, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("< Go Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminPanel adminP = new AdminPanel();
				
				adminP.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(0, 238, 89, 23);
		contentPane.add(btnNewButton_2);
		

		
		
	}
}
