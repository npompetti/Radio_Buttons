package radio_buttons;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class radio_group {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radio_group window = new radio_group();
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
	public radio_group() {
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
		
		JRadioButton smallButton = new JRadioButton("Small Button");
		smallButton.setSelected(true);
		smallButton.setBounds(173, 42, 200, 50);
		smallButton.setFont(new Font("Lucida Grande", Font.PLAIN, 9));
		frame.getContentPane().add(smallButton);
		
		JRadioButton mediumButton = new JRadioButton("Medium Button");
		mediumButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		mediumButton.setBounds(173, 118, 141, 23);
		frame.getContentPane().add(mediumButton);
		
		
		JRadioButton largeButton = new JRadioButton("Large Button");
		largeButton.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		largeButton.setBounds(173, 179, 141, 23);
		frame.getContentPane().add(largeButton);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(smallButton);
		group.add(mediumButton);
		group.add(largeButton);

	}
}
