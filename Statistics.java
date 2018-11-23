package project361;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class Statistics extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statistics frame = new Statistics();
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
	public Statistics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblStatistics = new JLabel("Statistics");
		lblStatistics.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblStatistics.setBounds(365, 11, 121, 14);
		contentPane.add(lblStatistics);

		JButton button = new JButton("< Go Back");
		button.setBounds(0, 448, 109, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComponent comp = (JComponent) e.getSource();
				java.awt.Window win = SwingUtilities.getWindowAncestor(comp);
				win.dispose();
			}
		});
		contentPane.add(button);

		JButton button_1 = new JButton("Exit");
		button_1.setBounds(709, 448, 89, 23);
		contentPane.add(button_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\EPL231\\epl361_FinalProject\\statistics.png"));
		lblNewLabel.setBounds(10, 36, 778, 401);
		contentPane.add(lblNewLabel);

	}
}
