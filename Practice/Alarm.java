package Practice;

public class Alarm extends Thread{

	AlarmTask obj = new AlarmTask();
	
	public void run()
	{
		obj.ringAlarm();
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception ex)
		{
			
		}
		
	}
	public class AlarmTask 
	{
	public void ringAlarm()
	{
		for(int i=0; i<6 ; i++)
		System.out.println("Beep!!!!");
	}

	}
	public static void main(String[] args) {
		
			new Alarm().start();
	}

}
