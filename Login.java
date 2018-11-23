package project361;

import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;

public class Login {

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
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setTitle("Login");
		frame.setResizable(false);
		frame.setSize(635, 477);

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(78, 120, 104, -12);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		// Username Label
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setBounds(27, 190, 132, 14);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblUsername);

		// Password Label
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setBounds(27, 226, 95, 14);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblPassword);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(132, 222, 102, 27);

		frame.getContentPane().add(passwordField_1);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(132, 184, 102, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		button = new JButton("Reset");
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField_1.setText(null);
			}
		});
		button.setBounds(128, 286, 89, 23);
		frame.getContentPane().add(button);

		JLabel lblLoginToAdmin = new JLabel("Login to Admin Panel");
		lblLoginToAdmin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblLoginToAdmin.setBounds(27, 29, 166, 23);
		frame.getContentPane().add(lblLoginToAdmin);

		// Login Button
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBounds(27, 286, 89, 23);
		frame.getRootPane().setDefaultButton(btnLogin);
		frame.getContentPane().add(btnLogin);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\EPL231\\epl361_FinalProject\\Web-Security.png"));
		lblNewLabel_1.setBounds(88, 0, 541, 449);
		frame.getContentPane().add(lblNewLabel_1);
		// contentPane.add(lblNewLabel);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\EPL231\\epl361_FinalProject\\Web-Security.png"));
		lblNewLabel.setBounds(359, 120, 46, 14);

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String uname = textField.getText();
				String pad = passwordField_1.getText();

				if (uname.equals("Admin") && pad.equals("1234")) {
					JOptionPane.showMessageDialog(frame, "You are sucessfully logined!!");

					// Create object - admin_webuser

					AdminPanel adminPanel = new AdminPanel();
					frame.dispose();

					adminPanel.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(frame, "Invalid username or password!!");
				}
			}
		});

	}
}
