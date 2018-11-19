package Project;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FORM_SELL_LET extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarios;
	private JTextField txtKyriakou;
	private JTextField textField_2;
	private JTextField txtMarioskyrcsucyaccy;
	private JTextField txtBedrooms;

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
		setBounds(100, 100, 469, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(44, 13, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Last Name :");
		label.setBounds(21, 38, 87, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Telephone :");
		label_1.setBounds(21, 63, 77, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Email :");
		label_2.setBounds(52, 94, 46, 14);
		contentPane.add(label_2);
		
		txtMarios = new JTextField();
		txtMarios.setText("Marios");
		txtMarios.setBounds(156, 11, 116, 17);
		contentPane.add(txtMarios);
		txtMarios.setColumns(10);
		
		txtKyriakou = new JTextField();
		txtKyriakou.setText("Kyriakou");
		txtKyriakou.setColumns(10);
		txtKyriakou.setBounds(156, 36, 116, 17);
		contentPane.add(txtKyriakou);
		
		textField_2 = new JTextField();
		textField_2.setText("99123456");
		textField_2.setColumns(10);
		textField_2.setBounds(156, 61, 116, 17);
		contentPane.add(textField_2);
		
		txtMarioskyrcsucyaccy = new JTextField();
		txtMarioskyrcsucyaccy.setText("marios_kyr@cs.ucy.ac.cy");
		txtMarioskyrcsucyaccy.setColumns(10);
		txtMarioskyrcsucyaccy.setBounds(156, 92, 145, 17);
		contentPane.add(txtMarioskyrcsucyaccy);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Buy");
		chckbxNewCheckBox.setBounds(152, 116, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("Rent");
		checkBox.setSelected(true);
		checkBox.setBounds(156, 182, 97, 23);
		contentPane.add(checkBox);
		
		txtBedrooms = new JTextField();
		txtBedrooms.setText("2 bedrooms");
		txtBedrooms.setColumns(10);
		txtBedrooms.setBounds(156, 240, 116, 29);
		contentPane.add(txtBedrooms);
		
		JLabel label_3 = new JLabel("Additional Information :");
		label_3.setBounds(5, 247, 139, 14);
		contentPane.add(label_3);
		
		String tabs[] ={"House","Appartment", "Commercial Property"};		
	
		
		JComboBox comboBox = new JComboBox(tabs);
		comboBox.setBounds(156, 141, 97, 29);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(tabs);
		comboBox_1.setBounds(156, 213, 97, 24);
		contentPane.add(comboBox_1);
		
		JLabel label_4 = new JLabel("Property type :");
		label_4.setBounds(5, 153, 85, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Property type :");
		label_5.setBounds(5, 207, 87, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Interested for :");
		label_6.setBounds(5, 120, 101, 14);
		contentPane.add(label_6);
		
		JButton button = new JButton("< Go Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Notifications nots2=new Notifications();
				nots2.setVisible(true);
			}
		});
		button.setBounds(0, 277, 102, 23);
		contentPane.add(button);
	}
}
