package jun15;

import javax.swing.*;
import java.awt.*;

public class Countdown {
	
	JFrame fr = new JFrame ("Count Down ");
	JLabel la = new JLabel();
	public Countdown()
	{
		fr.setSize(400,400);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,0,170));
		fr.add(la);
		la.setFont(new Font("arial",Font.PLAIN,39));
		new NumberThread().start();
		fr.setVisible(true);
	}
	
	class NumberThread extends Thread
	{
		public void run()
		{
			for(int i = 10 ; i>=1 ; i--)
			{
				la.setText(String.valueOf(i));
				
				try 
				{
					Thread.sleep(1000);
				}
				catch(Exception ex)
				{}
			}
			la.setText("Lets play");
			
		}
	}
	

	public static void main(String[] args) {
	
		new Countdown();
	}

}
