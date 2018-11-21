package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class Customer_Form extends JFrame {

	private JPanel contentPane;
	private JTextField txtJames;
	private JTextField txtLouis;
	private JTextField txtthMakariouStr;
	private JTextField txtJlouisoutlookcom;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer_Form frame = new Customer_Form();
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
	public Customer_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("< Go Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JComponent comp = (JComponent) e.getSource();
				  Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		btnNewButton.setBounds(0, 239, 99, 23);
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
		label_3.setBounds(234, 43, 89, 14);
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
		btnAdd.setBounds(137, 239, 89, 23);
		contentPane.add(btnAdd);
		
		JButton button = new JButton("- Delete");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(234, 239, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});
		button_1.setBounds(333, 239, 101, 23);
		contentPane.add(button_1);
		
		txtJames = new JTextField();
		txtJames.setText("James");
		txtJames.setBounds(123, 40, 86, 20);
		contentPane.add(txtJames);
		txtJames.setColumns(10);
		
		txtLouis = new JTextField();
		txtLouis.setText("Louis");
		txtLouis.setColumns(10);
		txtLouis.setBounds(123, 65, 86, 20);
		contentPane.add(txtLouis);
		
		txtthMakariouStr = new JTextField();
		txtthMakariouStr.setText("5th Makariou str, Limassol");
		txtthMakariouStr.setColumns(10);
		txtthMakariouStr.setBounds(123, 100, 164, 20);
		contentPane.add(txtthMakariouStr);
		
		txtJlouisoutlookcom = new JTextField();
		txtJlouisoutlookcom.setText("jlouis@outlook.com");
		txtJlouisoutlookcom.setColumns(10);
		txtJlouisoutlookcom.setBounds(123, 125, 164, 20);
		contentPane.add(txtJlouisoutlookcom);
		
		textField_5 = new JTextField();
		textField_5.setText("99915690");
		textField_5.setColumns(10);
		textField_5.setBounds(338, 40, 86, 20);
		contentPane.add(textField_5);
		
		JLabel lblCustomersInformation = new JLabel("Customer's Information");
		lblCustomersInformation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblCustomersInformation.setBounds(15, 11, 225, 14);
		contentPane.add(lblCustomersInformation);
	}
}

