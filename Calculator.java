import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends Applet implements ActionListener {
Button b1,b2,b3,b4,b5;
TextField TF1,TF2,TF3;
Label LB1,LB2,LB3;

	public void init()
	{
LB1 = new Label("Enter 1st Number");
LB1.setBounds(100,40,100,20);
TF1 = new TextField();
TF1.setBounds(210,40,100,20);
LB2 = new Label("Enter 2nd Number");
LB2.setBounds(100,80,100,20);
TF2 = new TextField();
TF2.setBounds(210,80,100,20);
LB3 = new Label("Result");
LB3.setBounds(100,120,100,20);
TF3 = new TextField();
TF3.setBounds(210,120,100,20);
b1 = new Button("+");
b1.setBounds(80,150,60,50);
b2 = new Button("-");
b2.setBounds(130,150,60,50);
b3 = new Button("x");
b3.setBounds(180,150,60,50);
b4 = new Button("/");
b4.setBounds(230,150,60,50);
b5 = new Button("Mod");
b5.setBounds(280,150,60,50);
add(LB1);
add(LB2);
add(LB3);
add(TF1);
add(TF2);
add(TF3);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
setLayout(null);
	}

	public void actionPerformed(ActionEvent e)
	 {
		int a = Integer.parseInt(TF1.getText());
		int b = Integer.parseInt(TF2.getText());
		if (e.getSource() == b1) 
		{
			TF3.setText(String.valueOf(a + b));
		}
		if (e.getSource() == b2) 
		{
			TF3.setText(String.valueOf(a - b));
		}
		if (e.getSource() == b3) 
		{
			TF3.setText(String.valueOf(a * b));
		}
		if (e.getSource() == b4)
		 {
			TF3.setText(String.valueOf(a / b));
		}
		if (e.getSource() == b5) 
		{
			TF3.setText(String.valueOf(a % b));
		}
	}
}
