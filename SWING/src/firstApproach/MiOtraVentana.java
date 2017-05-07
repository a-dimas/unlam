package firstApproach;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent.KeyBinding;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MiOtraVentana extends JFrame {

	private JPanel contentPane;
	private JTextField txtMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiOtraVentana frame = new MiOtraVentana();
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
	public MiOtraVentana() {
		setTitle("Chat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 191);
		contentPane.add(scrollPane);
		
		JTextArea txtChat = new JTextArea();
		txtChat.setLineWrap(true);
		txtChat.setToolTipText("toolTip!");
		txtChat.setForeground(Color.YELLOW);
		txtChat.setFont(new Font("Lucida Console", Font.PLAIN, 13));
		txtChat.setBackground(Color.BLACK);
		scrollPane.setViewportView(txtChat);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtChat.append(txtMessage.getText() + '\n');
				txtMessage.setText("");
			}
		});
		btnSend.setBounds(335, 213, 89, 37);
		contentPane.add(btnSend);
		
		txtMessage = new JTextField();
		txtMessage.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == 10){
					btnSend.doClick();
				}
			}
		});
		txtMessage.setBounds(10, 214, 318, 36);
		contentPane.add(txtMessage);
		txtMessage.setColumns(10);
		
	}
}
