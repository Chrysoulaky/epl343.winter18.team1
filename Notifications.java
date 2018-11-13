package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JMenu;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JMenuItem;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Label;
import java.awt.Font;
import java.awt.List;
import java.awt.Checkbox;
import java.awt.Color;
import javax.swing.JButton;


public class Notifications extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notifications frame = new Notifications();
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
	public Notifications() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Requests");
		label.setFont(new Font("Berlin Sans FB", Font.BOLD | Font.ITALIC, 16));
		label.setBounds(32, 10, 78, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Appoitments");
		label_1.setFont(new Font("Berlin Sans FB", Font.BOLD | Font.ITALIC, 16));
		label_1.setBounds(275, 10, 126, 22);
		contentPane.add(label_1);
		
		JButton button = new JButton("< Go Back");
		button.setBounds(0, 238, 109, 23);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				AdminPanel adminP = new AdminPanel();		
				adminP.setVisible(true);
			}
		});
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(345, 238, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(1);
			}
		});
		contentPane.add(btnNewButton_1);
	
	}
}
