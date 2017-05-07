package firstApproach;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiVentana extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana frame = new MiVentana();
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
	public MiVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(String.valueOf(Integer.parseInt(textField.getText()) + 1 ));
				setLocation(Integer.parseInt(textField.getText()) + 1 , Integer.parseInt(textField.getText()) - 1 );
			}
		});
		btnNewButton.setBounds(132, 31, 89, 23);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setBounds(132, 91, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		

	}
}
