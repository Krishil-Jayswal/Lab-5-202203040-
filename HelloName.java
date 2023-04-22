import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class HelloName extends Applet 
{
	
	public void paint(Graphics g) 
	{
		Scanner sc = new Scanner(System.in);
		g.drawString("Enter Your Name : ", 350, 300);
		String s = sc.nextLine();
		g.drawString("Hello "+s, 350, 350);
	}
}