package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;

public class Webpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Webpage frame = new Webpage();
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
	public Webpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
		         String url = "http://eriakouppari97.mozello.com/";
		         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		       }
		       catch (java.io.IOException ex) {
		           System.out.println(ex.getMessage());
		       }
			}
		});
		btnView.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnView.setBounds(68, 141, 89, 23);
		contentPane.add(btnView);
		
		
		JLabel lblNewLabel = new JLabel("Webpage");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(167, 25, 89, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("< Go Back");
		btnNewButton_2.setBounds(0, 238, 109, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				AdminPanel adminP = new AdminPanel();		
				adminP.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(345, 238, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(1);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEdit.setBounds(68, 95, 89, 23);
		contentPane.add(btnEdit);
		
		btnEdit.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Edit_Page info = new Edit_Page();		
				info.setVisible(true);
			}
		});
		
	

	}
}
