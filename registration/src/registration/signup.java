package registration;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField first;
	private JTextField second;
	private JTextField result;
	private JTable table;
	private JButton min;
	private JButton mul;
	private JButton div;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	public signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1120, 689);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 51, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ll = new JLabel("First Number: ");
		ll.setFont(new Font("Tahoma", Font.PLAIN, 23));
		ll.setBounds(447, 138, 151, 28);
		contentPane.add(ll);
		
		JLabel lblEmail = new JLabel("Second Number:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblEmail.setBounds(416, 198, 180, 28);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Result:");
		lblPassword.setForeground(new Color(153, 0, 51));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblPassword.setBounds(278, 342, 114, 28);
		contentPane.add(lblPassword);
		
		first = new JTextField();
		first.setBounds(608, 123, 207, 43);
		contentPane.add(first);
		first.setColumns(10);
		
		second = new JTextField();
		second.setColumns(10);
		second.setBounds(606, 189, 209, 43);
		contentPane.add(second);
		
		result = new JTextField();
		result.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		result.setEnabled(false);
		result.setToolTipText("");
		result.setForeground(Color.WHITE);
		result.setBackground(Color.GRAY);
		result.setColumns(10);
		result.setBounds(402, 309, 434, 85);
		contentPane.add(result);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "My Goodness, this is so concise");
				String firstnum=first.getText();
				int i=Integer.parseInt(firstnum);  
				String secondnum=second.getText();
				int j=Integer.parseInt(secondnum); 
				int k=i+j;
				String s=String.valueOf(k);  
				result.setText(s);
				first.setText("");
				second.setText("");




			}
		});
		add.setBackground(Color.BLACK);
		add.setForeground(Color.WHITE);
		add.setFont(new Font("Tahoma", Font.BOLD, 16));
		add.setBounds(402, 256, 101, 43);
		contentPane.add(add);
		
		table = new JTable();
		table.setBounds(204, 216, 323, -41);
		contentPane.add(table);
		
		min = new JButton("__");
		min.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstnum=first.getText();
				int i=Integer.parseInt(firstnum);  
				String secondnum=second.getText();
				int j=Integer.parseInt(secondnum); 
				int k=i-j;
				String s=String.valueOf(k);  
				result.setText(s);
				first.setText("");
				second.setText("");

			}
		});
		min.setForeground(Color.WHITE);
		min.setFont(new Font("Tahoma", Font.BOLD, 16));
		min.setBackground(Color.BLACK);
		min.setBounds(513, 256, 101, 43);
		contentPane.add(min);
		
		mul = new JButton("X");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstnum=first.getText();
				int i=Integer.parseInt(firstnum);  
				String secondnum=second.getText();
				int j=Integer.parseInt(secondnum); 
				int k=i*j;
				String s=String.valueOf(k);  
				result.setText(s);
				first.setText("");
				second.setText("");

			}
		});
		mul.setForeground(Color.WHITE);
		mul.setFont(new Font("Tahoma", Font.BOLD, 16));
		mul.setBackground(Color.BLACK);
		mul.setBounds(624, 256, 101, 43);
		contentPane.add(mul);
		
		div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstnum=first.getText();
				int i=Integer.parseInt(firstnum);  
				String secondnum=second.getText();
				int j=Integer.parseInt(secondnum); 
				int k=i/j;
				String s=String.valueOf(k);  
				result.setText(s);
				first.setText("");
				second.setText("");

			}
		});
		div.setForeground(Color.WHITE);
		div.setFont(new Font("Tahoma", Font.BOLD, 16));
		div.setBackground(Color.BLACK);
		div.setBounds(735, 256, 101, 43);
		contentPane.add(div);
	}
}
