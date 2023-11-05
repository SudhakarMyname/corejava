package Practice;

public class Sleep_demo extends Thread{
	
	public void run()
	{
		for(int i = 10 ; i >= 1 ; i--)
		{
			System.out.println(i);
			
			try 
			{
				Thread.sleep(1500);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
		System.out.println("Game Over");
	}

public static void main(String[] args) {
		

		Sleep_demo task = new Sleep_demo();
		task.start();	
	}
}
