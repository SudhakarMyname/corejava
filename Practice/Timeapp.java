package Practice;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
public class Timeapp 
{
	JFrame fr=new JFrame("Simple-Clock");
	JLabel la=new JLabel();
	public Timeapp()
	{
		fr.setSize(400,400);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(false);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,0,150));
		fr.add(la);
		la.setFont(new Font("arial",Font.PLAIN,40));
		la.setForeground(Color.white);
		
		new TimeThread().start();
		fr.setVisible(true);
		fr.getContentPane().setBackground(Color.black);
		
	}
	class TimeThread extends Thread
	{
		public void run()
		{
			while(true)
			{
				LocalTime lt=LocalTime.now();
				int h=lt.getHour();
				int m=lt.getMinute();
				int s=lt.getSecond();
				String am = " AM";
				String pm = " PM";
				if(h<12)
				{	
					if(h == 00) {
						h=12;
					}
					String time=(h<10?"0"+h:h)+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
					la.setText(time+am);
					try {
						Thread.sleep(1000);
					}catch(Exception ex) {}
				}else {
						if(h>12 && h<24)
							h-= 12;
				String time=(h<10?"0"+h:h)+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s);
					la.setText(time+pm);
					try {
						Thread.sleep(1000);
					}catch(Exception ex) {}
				}

			}
		}
	}
	public static void main(String[] args) 
	{
		new Timeapp();
	}
}
