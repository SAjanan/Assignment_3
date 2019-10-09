package assignment_3;
import java.awt.*;
import java.awt.event.*;

public class mainq1bq1 {
	Label head,lbl1,lbl2,lbl3;
	Button valu;
	TextField txt1,txt2,txt3;
	static double one,two;
	CheckboxGroup cbg ;
	 Checkbox checkBox1,checkBox2,checkBox3,checkBox4 ; 
	public mainq1bq1() {
		cbg = new CheckboxGroup();
		head = new Label("SIMPLE CALCULATOR");
		lbl1 = new Label("First Num :");
		lbl2= new Label("Second Num :");
		lbl3= new Label("ANSWER");
		txt1 = new TextField();
		txt2 = new TextField();
		txt3 = new TextField();
		checkBox1 = new Checkbox("ADD", cbg, false);
		checkBox2 = new Checkbox("SUBRACT", cbg, false);
		checkBox3 = new Checkbox("MULTIPLY", cbg, false);
		checkBox4 = new Checkbox("DIVIDE", cbg, false);
		valu=new Button("ANSWER");
	}
	public static void name() {
		Frame frame=new Frame();
		mainq1bq1 mains= new mainq1bq1();
		operq1bq1 om= new operq1bq1();
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
		
		
		
		mains.checkBox1.setBounds(150, 200, 200, 50);
		mains.checkBox1.setFont(fontsub);
		mains.checkBox1.addItemListener(new ItemListener() {
			
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
		mains.checkBox2.setBounds(350, 200, 200, 50);
		mains.checkBox2.setFont(fontsub);
		mains.checkBox2.addItemListener(new ItemListener() {
			
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
		mains.checkBox3.setBounds(550, 200, 200, 50);
		mains.checkBox3.setFont(fontsub);
		mains.checkBox3.addItemListener(new ItemListener() {
			
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
	//	frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
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





