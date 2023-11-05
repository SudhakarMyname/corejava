package jun15;

import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimeApp {

	JFrame fr = new JFrame("Count Down");
	JLabel la = new JLabel();
	int count = 0;
	
	public TimeApp()
	{
		fr.setSize(400, 400);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setResizable(false);
		fr.setVisible(true);
		fr.setLayout(new FlowLayout(FlowLayout.CENTER,0,166));
		fr.add(la);
		la.setFont(new Font("arial",Font.PLAIN,39));
		new TimeThread().start();
		
	}
	
		class TimeThread extends Thread
		{
			public void run()
			{
				while(true)
				{
					LocalTime lt = LocalTime.now();
					String Time = lt.getHour() + ":" + lt.getMinute() + ":" + lt.getSecond();
					la.setText(Time);
					try
					{
						count++;
						Thread.sleep(1000);
					}
					catch (Exception ex)
					{}
					if(count == 6)
						break;
//					{
//						try
//						{
//							Thread.sleep(10);
//						}
//						catch (Exception ex)
//						{}
//						System.exit(0);
//					}
//					}
//				LocalTime lt = LocalTime.now();
//				String t = 12+"";
//				System.out.println(t);
					}
				}
		}
	public static void main(String[] args) {
		
		new TimeApp();

	}

}
