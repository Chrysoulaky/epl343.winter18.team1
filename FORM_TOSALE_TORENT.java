package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class FORM_TOSALE_TORENT extends JFrame {
	



		private JPanel contentPane;
		private JTextField txtMaria;
		private JTextField txtNicolaou;
		private JTextField textField_2;
		private JTextField txtMnicolcsucyaccy;
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
			
			setBounds(100, 100, 366, 425);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Name :");
			lblNewLabel.setBounds(56, 53, 46, 14);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Last Name :");
			lblNewLabel_1.setBounds(46, 84, 71, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Telephone :");
			lblNewLabel_2.setBounds(46, 121, 71, 14);
			contentPane.add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Email :");
			lblNewLabel_3.setBounds(71, 146, 46, 14);
			contentPane.add(lblNewLabel_3);
			
			txtMaria = new JTextField();
			txtMaria.setText("Amalia");
			txtMaria.setBounds(125, 50, 132, 20);
			contentPane.add(txtMaria);
			txtMaria.setColumns(10);
			
			txtNicolaou = new JTextField();
			txtNicolaou.setText("Petrou");
			txtNicolaou.setColumns(10);
			txtNicolaou.setBounds(125, 81, 132, 20);
			contentPane.add(txtNicolaou);
			
			textField_2 = new JTextField();
			textField_2.setText("99564257");
			textField_2.setColumns(10);
			textField_2.setBounds(127, 115, 132, 20);
			contentPane.add(textField_2);
			
			txtMnicolcsucyaccy = new JTextField();
			txtMnicolcsucyaccy.setText("amaliap@outlook.com");
			txtMnicolcsucyaccy.setColumns(10);
			txtMnicolcsucyaccy.setBounds(125, 146, 132, 20);
			contentPane.add(txtMnicolcsucyaccy);
			
			label = new JLabel("Interested for :");
			label.setBounds(28, 173, 89, 14);
			contentPane.add(label);
			
			JCheckBox chckbxNewCheckBox = new JCheckBox("Sale");
			chckbxNewCheckBox.setSelected(true);
			chckbxNewCheckBox.setBounds(125, 186, 97, 23);
			contentPane.add(chckbxNewCheckBox);
			
			JCheckBox checkBox = new JCheckBox("Rent");
			checkBox.setBounds(125, 212, 97, 23);
			contentPane.add(checkBox);
			
			JLabel label_1 = new JLabel("Additional Information :");
			label_1.setBounds(0, 242, 141, 14);
			contentPane.add(label_1);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(91, 267, 132, 74);
			contentPane.add(textField_4);
			
			//JButton btnNewButton = new JButton("< Go Back");
			//btnNewButton.setBounds(0, 353, 102, 23);
			//contentPane.add(btnNewButton);
			
			JLabel lblNewLabel_4 = new JLabel("27/12/2018 16:00");
			lblNewLabel_4.setForeground(Color.RED);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_4.setBounds(4, 0, 141, 22);
			contentPane.add(lblNewLabel_4);
			
			JLabel lblNewLabel_5 = new JLabel("Link");
			lblNewLabel_5.setForeground(Color.BLUE);
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNewLabel_5.setBounds(14, 33, 46, 14);
			contentPane.add(lblNewLabel_5);
			
			JButton btnNewButton_1 = new JButton("< Go Back");
			btnNewButton_1.setBounds(0, 364, 102, 23);
			contentPane.add(btnNewButton_1);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {		
					Notifications not = new Notifications();		
					not.setVisible(true);
				}
			});
			
			
			
			
		}
	}
