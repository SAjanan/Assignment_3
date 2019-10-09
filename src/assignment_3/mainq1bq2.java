package assignment_3;

	import java.awt.*;
	import javax.swing.*;
	import java.awt.event.*;

	public class mainq1bq2 {
		JLabel head,lbl1,lbl2,lbl3;
		JButton valu;
		JTextField txt1,txt2,txt3;
		static double one,two;
		static JRadioButton  checkBox1 ;
		static JRadioButton checkBox2;
		static JRadioButton checkBox3;
		static JRadioButton checkBox4; 
		ButtonGroup bg;
		public mainq1bq2() { 
			head = new JLabel("SIMPLE CALCULATOR");
			lbl1 = new JLabel("First Num :");
			lbl2= new JLabel("Second Num :");
			lbl3= new JLabel("Answer");
			txt1 = new JTextField();
			txt2 = new JTextField();
			txt3 = new JTextField();
			bg=new ButtonGroup();
			checkBox1 = new JRadioButton ("ADD",  false);
			checkBox2 = new JRadioButton ("SUBRACT",false);
			checkBox3 = new JRadioButton ("MULTIPLY", false);
			checkBox4 = new JRadioButton ("DIVIDE",  false);
			valu=new JButton("Answer");
		}
		public static void name() {
			JFrame frame=new JFrame();
			mainq1bq2 mains= new mainq1bq2();
			mains.bg.add(checkBox1);
			mains.bg.add(checkBox2);
			mains.bg.add(checkBox3);
			mains.bg.add(checkBox4);
			operq1bq2 om= new operq1bq2();
			mains.head.setBounds(400, 20, 300, 100);
			Font fonts = new Font("TimesRoman", Font.BOLD, 25);
			Font fontsub = new Font("TimesRoman", Font.BOLD, 15);
			mains.head.setFont(fonts);
			mains.lbl1.setBounds(50, 100, 100, 50);
			mains.lbl1.setFont(fontsub);
			mains.txt1.setBounds(200, 100, 200, 50);
			mains.txt1.setFont(fontsub);
			mains.lbl2.setBounds(500, 100, 100, 50);
			mains.lbl2.setFont(fontsub);
			mains.txt2.setBounds(700, 100, 200, 50);
			mains.txt2.setFont(fontsub);
			
			
			
			checkBox1.setBounds(150, 200, 200, 50);
			checkBox1.setFont(fontsub);
			checkBox1.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					mains.valu.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							one= Double.parseDouble(mains.txt1.getText());
							two=Double.parseDouble(mains.txt2.getText());
							double r= om.adds(one, two);
							mains.txt3.setText(Double.toString(r));
							
						}
					});
					
				}
			});
			checkBox2.setBounds(350, 200, 200, 50);
			checkBox2.setFont(fontsub);
			checkBox2.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					mains.valu.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							one= Double.parseDouble(mains.txt1.getText());
							two=Double.parseDouble(mains.txt2.getText());
							double r= om.sub(one, two);
							mains.txt3.setText(Double.toString(r));
							
						}
					});
					
				}
			});
			checkBox3.setBounds(550, 200, 200, 50);
			checkBox3.setFont(fontsub);
			checkBox3.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					mains.valu.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							one= Double.parseDouble(mains.txt1.getText());
							two=Double.parseDouble(mains.txt2.getText());
							double r= om.mul(one, two);
							mains.txt3.setText(Double.toString(r));
							
						}
					});
					
				}
			});
			mains.checkBox4.setBounds(750, 200, 200, 50);
			mains.checkBox4.setFont(fontsub);
			mains.checkBox4.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					mains.valu.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							one= Double.parseDouble(mains.txt1.getText());
							two=Double.parseDouble(mains.txt2.getText());
							double r= om.div(one, two);
							mains.txt3.setText(Double.toString(r));
							
						}
					});
					
				}
			});
			
			
			
			mains.valu.setBounds(400, 250, 200, 50);
			mains.valu.setFont(fontsub);
			mains.txt3.setBounds(400, 300, 200, 50);
			mains.txt3.setFont(fontsub);
			
			
			
			
			frame.setVisible(true);
			frame.setSize(1000, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(null);
			frame.add(mains.head);
			frame.add(mains.lbl1);
			frame.add(mains.txt1);
			frame.add(mains.lbl2);
			frame.add(mains.txt2);
			frame.add(mains.checkBox1);
			frame.add(mains.checkBox2);
			frame.add(mains.checkBox3);
			frame.add(mains.checkBox4);
			frame.add(mains.txt3);
			frame.add(mains.valu);
		}
		public static void main(String[] args) {
			name();
		}
}
