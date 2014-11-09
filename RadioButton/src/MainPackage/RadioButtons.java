package MainPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class RadioButtons {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtons window = new RadioButtons();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioButtons() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(131, 51, 109, 152);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("small");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(0, 0, 109, 23);
		panel.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setSelected(true);
		
		
		JRadioButton rdbtnRadioButton = new JRadioButton("medium");
		buttonGroup.add(rdbtnRadioButton);
		rdbtnRadioButton.setBounds(0, 60, 109, 23);
		panel.add(rdbtnRadioButton);
		
		JRadioButton rdbtnRadioButton_1 = new JRadioButton("large");
		buttonGroup.add(rdbtnRadioButton_1);
		rdbtnRadioButton_1.setBounds(0, 129, 109, 23);
		panel.add(rdbtnRadioButton_1);
	}
}
