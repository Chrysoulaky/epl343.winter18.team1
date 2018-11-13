package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EmployeesForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeesForm frame = new EmployeesForm();
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
	public EmployeesForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnNewButton = new JButton("< Go Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Information frame = new Information();
				frame.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		btnNewButton.setBounds(5, 233, 105, 20);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(15, 43, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Surname");
		label.setBounds(15, 68, 71, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Address");
		label_1.setBounds(15, 103, 71, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("E-mail");
		label_2.setBounds(15, 128, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Phone Number");
		label_3.setBounds(217, 43, 89, 14);
		contentPane.add(label_3);
			
		JButton btnAdd = new JButton("+ Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().add(btnAdd);
			}
		});
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(151, 290, 89, 23);
		contentPane.add(btnDelete);
		btnAdd.setBounds(139, 230, 89, 23);
		contentPane.add(btnAdd);
		
		JButton button = new JButton("- Delete");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(234, 230, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});
		button_1.setBounds(335, 230, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(366, 198, 53, 21);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("<");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(303, 198, 53, 21);
		contentPane.add(button_3);
		
		
		
		JLabel lblCustomersInformation = new JLabel("Employee's Information");
		lblCustomersInformation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblCustomersInformation.setBounds(15, 11, 225, 14);
		contentPane.add(lblCustomersInformation);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(204, 198, 89, 21);
		contentPane.add(btnSearch);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(15, 153, 46, 14);
		contentPane.add(lblSalary);
		
		textField = new JTextField();
		textField.setBounds(100, 40, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 65, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 100, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 125, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100, 150, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(316, 40, 86, 20);
		contentPane.add(textField_5);
	}

}
