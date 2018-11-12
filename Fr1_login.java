package epl361_FinalProject;

import java.awt.EventQueue;
import java.awt.Window;
import java.awt.event.ActionListener;


import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;



import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;

public class Fr1_login {

	private JFrame frame;
	private JTextField textField;
	private JButton button;
	private JPasswordField passwordField_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fr1_login window = new Fr1_login();
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
	public Fr1_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Login");
		frame.setResizable(false);
		frame.setSize(450, 300);
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(78, 120, 104, -12);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		//Username Label
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setBounds(55, 97, 132, 14);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(lblUsername);
		
		//Password Label
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(55, 142, 132, 14);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(lblPassword);
		
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(215, 134, 102, 27);
		
		frame.getContentPane().add(passwordField_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(215, 77, 102, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		button = new JButton("Reset");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField_1.setText(null);
			}
		});
		button.setBounds(215, 198, 89, 23);
		frame.getContentPane().add(button);
		
		JLabel lblLoginToAdmin = new JLabel("Login to Admin Panel");
		lblLoginToAdmin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblLoginToAdmin.setBounds(109, 33, 162, 14);
		frame.getContentPane().add(lblLoginToAdmin);
		
		//Login Button
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(109, 198, 89, 23);
		frame.getRootPane().setDefaultButton(btnLogin);
		frame.getContentPane().add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
				String uname=textField.getText();
				String pad=passwordField_1.getText();
				
				if(uname.equals("Admin") && pad.equals("1234")){
					JOptionPane.showMessageDialog(frame, "You are sucessfully logined!!");

					//Create object - admin_webuser
					
					AdminPanel adminPanel = new AdminPanel();
					//adminPanel.MainScreen();
					frame.dispose();
		
					adminPanel.setVisible(true);
					
					
				
				}
				else{
					JOptionPane.showMessageDialog(frame, "Invalid username or password!!");
				}
			}
		});
		
		
		
		
		
		
	}
}
