package jun15;

import javax.swing.*;
import java.awt.*;

public class CountDown1 {

	JFrame fr = new JFrame("Count Down");
	JLabel la = new JLabel();
	
	public CountDown1()
	{
		fr.setSize(400, 400);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(false);
		fr.setVisible(true);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,0,166));
		fr.add(la);
		la.setFont(new Font("arial",Font.PLAIN,39));
		new NumberThread().start();
	}
	class NumberThread extends Thread
	{
		public void run()
		{
			for(int i=10 ; i>=1 ; i--)
			{
				la.setText(String.valueOf(i));
				try
				{
					Thread.sleep(2000);
				}
				catch (Exception ex)
				{}
			}
				la.setText("Let's Play");
				try
				{
					Thread.sleep(5000);
				}
				catch (Exception ex)
				{}
				System.exit(0);  //it will terminate jvm
			}
		}
	public static void main(String[] args) {
		new CountDown1();
	}
}
