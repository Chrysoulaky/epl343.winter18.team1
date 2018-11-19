package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Properties_types extends JFrame {

	private JPanel contentPane;
	private JTextField txtFk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Properties_types frame = new Properties_types();
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
	public Properties_types() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("< Go Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Information infs=new Information();
				infs.setVisible(true);
			}
		});
		button.setBounds(0, 239, 109, 23);
		contentPane.add(button);
		
		JLabel lblPropertyTypes = new JLabel("Property Types");
		lblPropertyTypes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPropertyTypes.setBounds(141, 11, 132, 23);
		contentPane.add(lblPropertyTypes);
		
		JButton button_1 = new JButton("< Go Back");
		button_1.setBounds(-22, 291, 109, 23);
		contentPane.add(button_1);
		
		JRadioButton radioButton = new JRadioButton("Appartment");
		radioButton.setBounds(101, 56, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Building");
		radioButton_1.setBounds(101, 82, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("House");
		radioButton_2.setSelected(true);
		radioButton_2.setBounds(101, 108, 109, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("Plot/Land");
		radioButton_3.setBounds(101, 135, 109, 23);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Store");
		radioButton_4.setBounds(212, 82, 109, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("Storage Building");
		radioButton_5.setBounds(212, 56, 109, 23);
		contentPane.add(radioButton_5);
		
		JButton btnGo = new JButton("Go >");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Properties pro_forms=new Properties();
				pro_forms.setVisible(true);
			}
		});
		btnGo.setBounds(325, 239, 109, 23);
		contentPane.add(btnGo);
		
		JLabel lblNewLabel = new JLabel("Plot Code:");
		lblNewLabel.setBounds(101, 183, 70, 14);
		contentPane.add(lblNewLabel);
		
		txtFk = new JTextField();
		txtFk.setBounds(166, 180, 86, 20);
		contentPane.add(txtFk);
		txtFk.setColumns(10);
	}

}
