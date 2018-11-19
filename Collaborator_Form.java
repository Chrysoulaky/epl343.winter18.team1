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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Collaborator_Form extends JFrame {

	private JPanel contentPane;
	private JTextField txtJoulia;
	private JTextField txtSvetlana;
	private JTextField txtrdKyriakouMatsi;
	private JTextField txtJoulissmithoutlookcom;
	private JTextField textField_4;
	private JTextField txtKj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Collaborator_Form frame = new Collaborator_Form();
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
	public Collaborator_Form() {
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
		btnNewButton.setBounds(0, 230, 97, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblCustomersInformation = new JLabel("Collaborator's Information");
		lblCustomersInformation.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblCustomersInformation.setBounds(15, 11, 225, 14);
		contentPane.add(lblCustomersInformation);
		
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(15, 43, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Surname");
		label.setBounds(15, 68, 71, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Address");
		label_1.setBounds(15, 138, 71, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("E-mail");
		label_2.setBounds(15, 163, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Phone Number");
		label_3.setBounds(234, 43, 89, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Number of License");
		label_4.setBounds(15, 107, 107, 20);
		contentPane.add(label_4);
		
		txtJoulia = new JTextField();
		txtJoulia.setText("Joulia");
		txtJoulia.setBounds(138, 40, 86, 20);
		contentPane.add(txtJoulia);
		txtJoulia.setColumns(10);
		
		txtSvetlana = new JTextField();
		txtSvetlana.setText("Smith");
		txtSvetlana.setColumns(10);
		txtSvetlana.setBounds(138, 65, 86, 20);
		contentPane.add(txtSvetlana);
		
		txtrdKyriakouMatsi = new JTextField();
		txtrdKyriakouMatsi.setText("3rd, Kyriakou Matsi str, Nicosia");
		txtrdKyriakouMatsi.setColumns(10);
		txtrdKyriakouMatsi.setBounds(138, 135, 195, 20);
		contentPane.add(txtrdKyriakouMatsi);
		
		txtJoulissmithoutlookcom = new JTextField();
		txtJoulissmithoutlookcom.setText("JoulisSmith@outlook.com\r\n");
		txtJoulissmithoutlookcom.setColumns(10);
		txtJoulissmithoutlookcom.setBounds(138, 160, 195, 20);
		contentPane.add(txtJoulissmithoutlookcom);
		
		textField_4 = new JTextField();
		textField_4.setText("99-965478");
		textField_4.setColumns(10);
		textField_4.setBounds(333, 40, 86, 20);
		contentPane.add(textField_4);
		
		txtKj = new JTextField();
		txtKj.setText("KJ-12345");
		txtKj.setColumns(10);
		txtKj.setBounds(138, 107, 86, 20);
		contentPane.add(txtKj);
		
		JButton btnAdd = new JButton("+ Add");
		btnAdd.setHorizontalAlignment(SwingConstants.LEFT);
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
		btnAdd.setBounds(151, 235, 89, 23);
		contentPane.add(btnAdd);
		
		JButton button = new JButton("- Delete");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(244, 235, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});
		button_1.setBounds(345, 235, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton(">");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(366, 203, 53, 21);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("<");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setBounds(303, 203, 53, 21);
		contentPane.add(button_3);
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(204, 203, 89, 21);
		contentPane.add(btnSearch);
	}
}
