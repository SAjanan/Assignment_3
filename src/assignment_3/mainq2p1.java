package assignment_3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainq2p1 {
	
		Label title,height,weight,result,resultvalue,resulttext;
		TextField heiField,weiField;
		Button buttonresult;
		
		public mainq2p1() {
			title=new Label("BMI CALCULATOR");
			height= new Label("Height(m)");
			weight= new Label("Weight(kg)");
			result= new Label("Your BMI Is : ");
			resultvalue= new Label();
			resulttext= new Label();
			heiField = new TextField();
			weiField= new TextField();
			buttonresult= new Button("Calculate");
		}
		public static void design() {
			Frame frame= new Frame();
			mainq2p1 mains= new mainq2p1();
			Font fonts = new Font("TimesRoman", Font.BOLD, 25);
			Font fontsub = new Font("TimesRoman", Font.BOLD, 15);
			mains.title.setFont(fonts);
			frame.setSize(1000, 500);
			mains.title.setBounds(300, 20, 300, 100);
			mains.height.setBounds(250, 150, 100, 50);
			mains.height.setFont(fontsub);
			mains.heiField.setBounds(350, 150, 250, 50);
			mains.heiField.setFont(fontsub);
			mains.weight.setBounds(250, 200, 100, 50);
			mains.weight.setFont(fontsub);
			mains.weiField.setBounds(350, 200, 250, 50);
			mains.weiField.setFont(fontsub);
			mains.resultvalue.setBounds(400, 400, 150, 50);
			mains.resultvalue.setFont(fontsub);
			mains.resulttext.setBounds(600, 400, 250, 50);
			mains.resulttext.setFont(fontsub);
			mains.buttonresult.setBounds(400, 290, 150, 50);
			mains.buttonresult.setFont(fontsub);
			mains.buttonresult.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				double heights= Double.parseDouble(mains.heiField.getText());
				double Weights= Double.parseDouble(mains.weiField.getText());
				double bmi= (Weights/(heights*heights));
				if(bmi>23) {
					mains.resultvalue.setText(Double.toString(bmi));
					mains.resulttext.setText("Obese");
				}else if(bmi>16) {
					mains.resultvalue.setText(Double.toString(bmi));
					mains.resulttext.setText("Normal");
				}else if(bmi<16) {
					mains.resultvalue.setText(Double.toString(bmi));
					mains.resulttext.setText("thin");
				}
					
				}
			});
			mains.result.setBounds(250, 400, 150, 50);
			mains.result.setFont(fontsub);
			frame.setLocationRelativeTo(null);  
			frame.setLayout(null);
			frame.setVisible(true); 
			frame.add(mains.title);
			frame.add(mains.height);
			frame.add(mains.heiField);
			frame.add(mains.weight);
			frame.add(mains.weiField);
			frame.add(mains.buttonresult);
			frame.add(mains.result);
			frame.add(mains.resultvalue);
			frame.add(mains.resulttext);
			frame.setBackground( Color.DARK_GRAY );
		}

		protected void setTextcolor(Color red) {
			// TODO Auto-generated method stub
			
		}
		public static void main(String[] args) {
			
			design();
		}

	
}

