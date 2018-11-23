package project361;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class Properties extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtGeorge;
	private JTextField textField;
	private JTextField txtThemistokliDervi;
	private JTextField textField_1;
	private JTextField txtAglatzia;
	private JTextField textField_2;
	private JTextField txtFk;
	private JEditorPane txtBed;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Properties frame = new Properties();
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
	public Properties() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("< Go Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComponent comp = (JComponent) e.getSource();
				  java.awt.Window win = SwingUtilities.getWindowAncestor(comp);
				  win.dispose();
			}
		});
		button.setBounds(0, 415, 109, 23);
		contentPane.add(button);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnExit.setBounds(520, 415, 87, 23);
		contentPane.add(btnExit);
		
		JLabel lblNameOfOwner = new JLabel("Name of Owner:");
		lblNameOfOwner.setBounds(31, 84, 95, 14);
		contentPane.add(lblNameOfOwner);
		
		txtGeorge = new JTextField();
		txtGeorge.setText("George Achilleos");
		txtGeorge.setBounds(136, 81, 95, 20);
		contentPane.add(txtGeorge);
		txtGeorge.setColumns(10);
		
		JLabel lblTelephone = new JLabel("Telephone:");
		lblTelephone.setBounds(31, 116, 78, 14);
		contentPane.add(lblTelephone);
		
		textField = new JTextField();
		textField.setText("99-945235");
		textField.setColumns(10);
		textField.setBounds(136, 113, 86, 20);
		contentPane.add(textField);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(31, 147, 78, 14);
		contentPane.add(lblAddress);
		
		txtThemistokliDervi = new JTextField();
		txtThemistokliDervi.setText("12 Themistokli Dervi str, Nicosia");
		txtThemistokliDervi.setColumns(10);
		txtThemistokliDervi.setBounds(136, 144, 164, 20);
		contentPane.add(txtThemistokliDervi);
		
		JLabel lblKindOfProperty = new JLabel("Kind of Property:");
		lblKindOfProperty.setBounds(31, 183, 95, 14);
		contentPane.add(lblKindOfProperty);
		
		JRadioButton rdbtnAppartment = new JRadioButton("Appartment");
		rdbtnAppartment.setBounds(136, 179, 109, 23);
		contentPane.add(rdbtnAppartment);
		
		JRadioButton rdbtnBuilding = new JRadioButton("Building");
		rdbtnBuilding.setBounds(136, 205, 109, 23);
		contentPane.add(rdbtnBuilding);
		
		JRadioButton rdbtnHouse = new JRadioButton("House");
		rdbtnHouse.setSelected(true);
		rdbtnHouse.setBounds(136, 231, 109, 23);
		contentPane.add(rdbtnHouse);
		
		JRadioButton rdbtnPlotland = new JRadioButton("Plot/Land");
		rdbtnPlotland.setBounds(136, 258, 109, 23);
		contentPane.add(rdbtnPlotland);
		
		JRadioButton rdbtnStorageBuilding = new JRadioButton("Storage Building");
		rdbtnStorageBuilding.setBounds(247, 179, 109, 23);
		contentPane.add(rdbtnStorageBuilding);
		
		JRadioButton rdbtnStore = new JRadioButton("Store");
		rdbtnStore.setBounds(247, 205, 109, 23);
		contentPane.add(rdbtnStore);
		
		JLabel lblPlotSize = new JLabel("Plot Size:");
		lblPlotSize.setBounds(35, 302, 95, 14);
		contentPane.add(lblPlotSize);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("-");
		textField_1.setColumns(10);
		textField_1.setBounds(89, 299, 86, 20);
		contentPane.add(textField_1);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(35, 334, 52, 14);
		contentPane.add(lblArea);
		
		txtAglatzia = new JTextField();
		txtAglatzia.setText("Aglatzia");
		txtAglatzia.setHorizontalAlignment(SwingConstants.LEFT);
		txtAglatzia.setColumns(10);
		txtAglatzia.setBounds(89, 331, 86, 20);
		contentPane.add(txtAglatzia);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setBounds(31, 365, 52, 14);
		contentPane.add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setText("1000");
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		textField_2.setBounds(85, 362, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblPlotCode = new JLabel("Plot Code:");
		lblPlotCode.setBounds(31, 53, 95, 14);
		contentPane.add(lblPlotCode);
		
		txtFk = new JTextField();
		txtFk.setText("FK-3564");
		txtFk.setColumns(10);
		txtFk.setBounds(136, 50, 86, 20);
		contentPane.add(txtFk);
		
		JLabel lblPropertyInformation = new JLabel("Property Information");
		lblPropertyInformation.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPropertyInformation.setBounds(10, 11, 214, 31);
		contentPane.add(lblPropertyInformation);
		
		JLabel lblOtherDetails = new JLabel("Other Details:");
		lblOtherDetails.setBounds(384, 40, 95, 14);
		contentPane.add(lblOtherDetails);
		
		txtBed = new JEditorPane();
		txtBed.setText("- 3 Bed Rooms\r\n- 4 A/C\r\n- 2 Toilets\r\n- Garden");
		txtBed.setToolTipText("\r\n");
		txtBed.setBounds(384, 66, 194, 147);
		contentPane.add(txtBed);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("For Sale ");
		chckbxNewCheckBox.setBounds(229, 298, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxForRent = new JCheckBox("For Rent ");
		chckbxForRent.setSelected(true);
		chckbxForRent.setBounds(229, 330, 97, 23);
		contentPane.add(chckbxForRent);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(384, 65, 194, 156);
		contentPane.add(editorPane);
		
		JButton btnDeleteForm = new JButton("- Delete Form\r\n");
		btnDeleteForm.setBounds(384, 298, 125, 23);
		contentPane.add(btnDeleteForm);
		
		JButton btnaddPictures = new JButton("+Add Pictures");
		btnaddPictures.setBounds(384, 273, 125, 23);
		contentPane.add(btnaddPictures);
	}
}
