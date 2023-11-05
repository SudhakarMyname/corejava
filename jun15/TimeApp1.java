package jun15;

import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalTime;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TimeApp1 {
	
	JFrame fr = new JFrame("Clock");
	JLabel la = new JLabel();
	
	public TimeApp1()
	{
		fr.setSize(400,400);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(false);
		fr.setLayout(new FlowLayout (FlowLayout.CENTER,0,166) );
		fr.add(la);
		la.setFont(new Font("",Font.BOLD,39));
		new TimeThread().start();
		fr.setVisible(true);
	}
	
	class TimeThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				LocalTime lt = LocalTime.now();
				int h = lt.getHour();
				if (h > 12)
				{
					h -= 12;
				}
				int m = lt.getMinute();
				int s = lt.getSecond();
				String Time = (h < 10 ? "0" + h : h) + ":" + (m < 10 ? "0" + m:m) + ":" + (s < 10 ? "0" + s : s);
				la.setText(Time);
				try 
				{
					Thread.sleep(1000);
				}
				catch (Exception ex)
				{}
				
			}
		
		}
	}
	public static void main(String[] args) {
		
		new TimeApp1();

	}

}
