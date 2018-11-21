package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import java.awt.SystemColor;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class New_Article extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_Article frame = new New_Article();
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
	public New_Article() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 395);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("< Go Back");
		button.setBounds(0, 333, 109, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				 JComponent comp = (JComponent) e.getSource();
				  Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
			}
		});
		contentPane.add(button);
		
		JButton button_1 = new JButton("Exit");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
			
		});
		button_1.setBounds(414, 333, 89, 23);
		contentPane.add(button_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setToolTipText("");
		editorPane.setBounds(10, 11, 275, 228);
		contentPane.add(editorPane);
		
		JButton button_2 = new JButton("Save and Publish");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Edit_Page edition=new Edit_Page();
				edition.setVisible(true);
			}
		});
		button_2.setBounds(57, 250, 164, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("+ Upload Photo");
		button_3.setBounds(292, 29, 164, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("+ Upload Video");
		button_4.setBounds(294, 74, 162, 23);
		contentPane.add(button_4);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				Edit_Page adminP = new Edit_Page();		
				adminP.setVisible(true);
			}
		});
		
	}
}
