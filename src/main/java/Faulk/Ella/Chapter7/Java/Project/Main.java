package Faulk.Ella.Chapter7.Java.Project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField numerator;
	private JTextField denominator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
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
		
		JLabel lblNewLabel = new JLabel("Numerator");
		lblNewLabel.setBounds(128, 6, 108, 16);
		frame.getContentPane().add(lblNewLabel);
		
		numerator = new JTextField();
		numerator.setBounds(117, 21, 130, 26);
		frame.getContentPane().add(numerator);
		numerator.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Denominator");
		lblNewLabel_1.setBounds(308, 6, 112, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		denominator = new JTextField();
		denominator.setBounds(303, 23, 130, 26);
		frame.getContentPane().add(denominator);
		denominator.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("division calculation");
		lblNewLabel_2.setBounds(198, 75, 156, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calculate");
		
		btnNewButton.setBounds(210, 99, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Answer");
		lblNewLabel_3.setBounds(102, 147, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				Double Numerator = Double.parseDouble(numerator.getText());
				Double Denominator = Double.parseDouble(denominator.getText());
				SimpleMath numbers = new SimpleMath();
				Double result = numbers.divide(Numerator,Denominator);
				lblNewLabel_3.setText(String.valueOf(result));
				}
				catch(ArithmeticException e1){
					lblNewLabel_3.setText("Cannot divide by zero");
					
				}
			}
		});
	}
}
