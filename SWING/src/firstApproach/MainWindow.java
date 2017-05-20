package firstApproach;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"pepe", "juan", "paco", "pedro", "de la mar"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(10, 11, 377, 172);
		contentPane.add(list);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chat chat = new Chat(list.getSelectedValuesList().get(0));
				chat.setVisible(true);
				
			}
		});
		btnConectar.setBounds(10, 207, 89, 23);
		contentPane.add(btnConectar);
		
		JButton btnMultichat = new JButton("MultiChat");
		btnMultichat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chat chat = new Chat(list.getSelectedValuesList());
				chat.setVisible(true);	
			}
		});
		btnMultichat.setBounds(109, 207, 89, 23);
		contentPane.add(btnMultichat);
	}
}
