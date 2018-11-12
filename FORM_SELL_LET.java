package epl361_FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class FORM_SELL_LET extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FORM_SELL_LET frame = new FORM_SELL_LET();
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
	public FORM_SELL_LET() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(75, 13, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Last Name :");
		label.setBounds(52, 38, 64, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Telephone :");
		label_1.setBounds(52, 63, 64, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Email :");
		label_2.setBounds(75, 88, 46, 14);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(129, 11, 116, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(129, 38, 116, 17);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 65, 116, 17);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(129, 92, 116, 17);
		contentPane.add(textField_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Buy");
		chckbxNewCheckBox.setBounds(129, 116, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("Rent");
		checkBox.setBounds(129, 177, 97, 23);
		contentPane.add(checkBox);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(129, 232, 116, 29);
		contentPane.add(textField_4);
		
		JLabel label_3 = new JLabel("Additional Information :");
		label_3.setBounds(0, 232, 116, 14);
		contentPane.add(label_3);
		
		JButton btnNewButton = new JButton("+ Upload Photos");
		btnNewButton.setBounds(254, 116, 116, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("+ Upload Photos");
		button.setBounds(254, 177, 116, 23);
		contentPane.add(button);
		
		String tabs[] ={"House","Appartment", "Commercial Property"};		
	
		
		JComboBox comboBox = new JComboBox(tabs);
		comboBox.setBounds(129, 146, 97, 29);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(tabs);
		comboBox_1.setBounds(129, 207, 97, 24);
		contentPane.add(comboBox_1);
		
		JLabel label_4 = new JLabel("Property type :");
		label_4.setBounds(39, 153, 77, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Property type :");
		label_5.setBounds(39, 207, 77, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Interested for :");
		label_6.setBounds(29, 120, 77, 14);
		contentPane.add(label_6);
	}
}
