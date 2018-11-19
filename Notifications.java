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
import javax.swing.ScrollPaneConstants;
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
import javax.swing.JList;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


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
		setBounds(100, 100, 541, 355);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Requests");
		label.setFont(new Font("Berlin Sans FB", Font.BOLD | Font.ITALIC, 16));
		label.setBounds(44, 26, 78, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("Appointments");
		label_1.setFont(new Font("Berlin Sans FB", Font.BOLD | Font.ITALIC, 16));
		label_1.setBounds(337, 26, 126, 22);
		contentPane.add(label_1);
		
		JButton button = new JButton("< Go Back");
		button.setBounds(0, 294, 109, 23);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminPanel adminP = new AdminPanel();		
				adminP.setVisible(true);
				
				
			}
		});
		
		 
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(436, 294, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(1);
			}
		});
		contentPane.add(btnNewButton_1);
		
		
		//JScrollPane scrollPane = new JScrollPane();
		//scrollPane.setBounds(252, 139, -45, -25);
		//contentPane.add(scrollPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 107, 208, 128);
		contentPane.add(scrollPane);
		
		
		 String[] array = {"Marios Kyriakou", "Andreas Petrou", "Andri Andreou","Maria Stylianou","Petros Petrou","Constantinos Constantinou","Nicolas Nicolaou","Alexandros Melas","Tony Demetriou","Anna Razi"};
			JList list = new JList(array);
			
			scrollPane.setViewportView(list);
			
			JScrollPane scrollPane1 = new JScrollPane();
			scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane1.setBounds(280, 107, 208, 128);
			contentPane.add(scrollPane1);
			
		
			
			String[] array1 = {"Amalia Petrou", "Andreas Kyriakou", "Leda Stylianou","Maria Constantinou","Constantinos Nicolaou","Nicolas Damianou","Elena Andreou","Marios Alexandrou","Tony Demetriou","Anna Razi"};
		
			JList list_1 = new JList(array1);
			scrollPane1.setViewportView(list_1);
			
			JButton btnNewButton = new JButton("See form");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FORM_SELL_LET form2=new FORM_SELL_LET();
					form2.setVisible(true);
				}
			});
			btnNewButton.setBounds(10, 75, 89, 23);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_2 = new JButton("See form");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FORM_TOSALE_TORENT form1 = new FORM_TOSALE_TORENT();		
					form1.setVisible(true);
				}
			});
			btnNewButton_2.setBounds(279, 73, 89, 23);
			contentPane.add(btnNewButton_2);
			
			
			
			
			
			
			
			
			
	
	
	}
}
