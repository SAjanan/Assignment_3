package assignment_3;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.SwingConstants;



import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class operq4 {

	private static JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	 static LinkedList<String> list_task=new LinkedList<String>();
	  static LinkedList<String> list_priod=new LinkedList<String>();
	  static int Height=150;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					q4 window = new q4();
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
	public operq4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.setBounds(100, 100, 515, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TASK SCHEDULAR");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(26, 11, 446, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTask = new JLabel("Task");
		lblTask.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTask.setBounds(109, 69, 53, 18);
		frame.getContentPane().add(lblTask);
		
		JLabel lblElasped = new JLabel("Elasped Time");
		lblElasped.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblElasped.setBounds(261, 69, 109, 18);
		frame.getContentPane().add(lblElasped);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField.setBounds(55, 98, 157, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(232, 98, 157, 24);
		frame.getContentPane().add(textField_1);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list_task.add(textField.getText());
				list_priod.add(textField_1.getText());
				componets_Function();
				list_task.clear();;
				list_priod.clear();
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAdd.setBounds(399, 100, 89, 23);
		frame.getContentPane().add(btnAdd);
	}
	public static void componets_Function() {
		for(int i=0; i<list_task.size();i++) {
			String task= list_task.get(i);
			String time= list_priod.get(i);
			JLabel jLabel1 = new JLabel();
			jLabel1.setBounds(100, Height, 89, 23);
			frame.getContentPane().add(jLabel1);
			jLabel1.setText(task);
			JLabel jLabel2 = new JLabel();
			jLabel2.setBounds(200, Height, 89, 23);
			frame.getContentPane().add(jLabel2);
			jLabel2.setText(time);
			JCheckBox jCheckBox = new JCheckBox("Complete");
			jCheckBox.setBounds(350, Height, 89, 23);
			frame.getContentPane().add(jCheckBox);
			jCheckBox.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					jCheckBox.setForeground(Color.GREEN);
					
				}
			});
			JButton jbutton=new JButton("Delete");
			jbutton.setBounds(250, Height, 89, 23);
			frame.getContentPane().add(jbutton);
			jbutton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					jLabel2.setVisible(false);
					jLabel1.setVisible(false);
					jbutton.setVisible(false);
					jCheckBox.setVisible(false);
					
				}
			});
			Height=Height+20;
			//System.out.print(list_task.get(i));
		}
	}
}


