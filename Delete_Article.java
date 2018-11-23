package project361;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import com.sun.glass.ui.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class Delete_Article extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Article frame = new Delete_Article();
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
	public Delete_Article() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 533, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 107, 461, 128);
		contentPane.add(scrollPane);
		
		 String[] array = {"Post1", "Post2", "Post3","Post4","Post5","Post6","Post7","Post8","Post9","Post10"};
		JList list = new JList(array);
		
		scrollPane.setViewportView(list);
		
		
		JLabel lblSearch = new JLabel("Search:");
		lblSearch.setBounds(10, 36, 46, 14);
		contentPane.add(lblSearch);
		
		textField = new JTextField();
		textField.setBounds(66, 30, 168, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("< Go Back");
		button.setBounds(0, 268, 109, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JComponent comp = (JComponent) e.getSource();
				  java.awt.Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
			}
		});
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.setBounds(428, 268, 89, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		contentPane.add(button_1);
		
		JButton btnDelete = new JButton("- Delete");
		btnDelete.setBounds(268, 29, 89, 23);
		contentPane.add(btnDelete);
		
		
	}
}
