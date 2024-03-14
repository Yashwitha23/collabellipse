package movie;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class recomendation {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recomendation window = new recomendation();
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
	public recomendation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 514, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBackground(new Color(255, 0, 128));
		lblNewLabel_1.setForeground(new Color(0, 255, 64));
		lblNewLabel_1.setBounds(104, 70, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movies");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setForeground(new Color(255, 0, 128));
		lblNewLabel_2.setBounds(97, 107, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NO OF TIC");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setForeground(new Color(128, 0, 128));
		lblNewLabel_3.setBounds(97, 147, 99, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 255));
		t1.setBounds(244, 69, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBackground(new Color(255, 128, 255));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "HOWL", "SPIRITED AWAY", "MY NAME", "EVIL DEAD", "ROBOT", "SUNSHINE"}));
		cb1.setBounds(244, 106, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setBackground(new Color(128, 128, 192));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5"}));
		cb2.setBounds(244, 145, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=0;
				String name=t1.getText();
				String movie=(String) cb1.getSelectedItem();
				String nt=(String) cb2.getSelectedItem();
				int tc=Integer.parseInt(nt);
				if(movie.equals("HOWL"))
				{
					bill=bill+100*tc;
				}
				if(movie.equals("EVIL DEAD"))
				{
					bill=bill+210*tc;
				}
				if(movie.equals("MY NAMEE"))
				{
					bill=bill+200*tc;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "Name: "+name+"\n Movie: "+movie+"\nTickets: "+tc+"\n Amount "+bill);
				int YES_OPTION = 0;
				if(res==YES_OPTION)
				{
				 JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFIRMATION");	
					
				}
				else
				{
				 JOptionPane.showMessageDialog(btnNewButton, "BOOKING CANCELED");	
				}
			}
		});
		btnNewButton.setBounds(182, 195, 126, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("TICKET BOOKING");
		lblNewLabel_5.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_5.setForeground(new Color(255, 0, 128));
		lblNewLabel_5.setBounds(136, 24, 194, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lb = new JLabel("");
		lb.setIcon(new ImageIcon("C:\\Users\\online lab\\Pictures\\socC.jpg"));
		lb.setBounds(0, 0, 498, 261);
		frame.getContentPane().add(lb);
	}
}
