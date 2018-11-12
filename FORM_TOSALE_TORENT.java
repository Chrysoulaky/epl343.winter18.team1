package epl361_FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class FORM_TOSALE_TORENT extends JFrame {
	



		private JPanel contentPane;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JLabel label;
		private JTextField textField_4;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						FORM_TOSALE_TORENT frame = new FORM_TOSALE_TORENT();
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
		public FORM_TOSALE_TORENT() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setBounds(100, 100, 450, 395);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Name :");
			lblNewLabel.setBounds(71, 33, 46, 14);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Last Name :");
			lblNewLabel_1.setBounds(46, 58, 71, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Telephone :");
			lblNewLabel_2.setBounds(46, 80, 61, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Email :");
			lblNewLabel_3.setBounds(74, 105, 46, 14);
			contentPane.add(lblNewLabel_3);
			
			textField = new JTextField();
			textField.setBounds(125, 28, 132, 20);
			contentPane.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(125, 52, 132, 20);
			contentPane.add(textField_1);
			
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(125, 77, 132, 20);
			contentPane.add(textField_2);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(125, 102, 132, 20);
			contentPane.add(textField_3);
			
			label = new JLabel("Interested for :");
			label.setBounds(31, 140, 82, 14);
			contentPane.add(label);
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("Sale");
			chckbxNewCheckBox.setBounds(125, 154, 97, 23);
			contentPane.add(chckbxNewCheckBox);
			
			JCheckBox checkBox = new JCheckBox("Rent");
			checkBox.setBounds(125, 180, 97, 23);
			contentPane.add(checkBox);
			
			JLabel label_1 = new JLabel("Additional Information :");
			label_1.setBounds(4, 214, 113, 14);
			contentPane.add(label_1);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(125, 235, 132, 74);
			contentPane.add(textField_4);
		}
	}
