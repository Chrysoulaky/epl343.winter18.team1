package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Checkbox;
import java.awt.List;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class Rights extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rights frame = new Rights();
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
	public Rights() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 303);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("< Go Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComponent comp = (JComponent) e.getSource();
				  Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
			
			}
		});
		button.setBounds(0, 241, 105, 20);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.exit(-1);
				}			
		});
		button_1.setBounds(302, 238, 89, 23);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("Get the Right of ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(114, 11, 122, 38);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(199, 112, 48, -28);
		contentPane.add(table);
		
		Checkbox checkbox = new Checkbox("Edit Webpage");
		checkbox.setBounds(35, 66, 95, 22);
		contentPane.add(checkbox);
		
		Checkbox checkbox_1 = new Checkbox("See Notifications");
		checkbox_1.setBounds(35, 96, 112, 22);
		contentPane.add(checkbox_1);
		
		Checkbox checkbox_2 = new Checkbox("See Customer's Form");
		checkbox_2.setBounds(191, 66, 132, 22);
		contentPane.add(checkbox_2);
		
		Checkbox checkbox_3 = new Checkbox("See Collaborator's Form");
		checkbox_3.setBounds(191, 96, 158, 22);
		contentPane.add(checkbox_3);
		
		JButton btnSave_1 = new JButton("Save");
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmployeesForm frame = new EmployeesForm();
				frame.setVisible(true);
			}
		});
		btnSave_1.setBounds(132, 163, 89, 23);
		contentPane.add(btnSave_1);
		
		JButton btnSave = new JButton("Save");
		
	}
}
