package Practice;
public class Thread2 extends Thread
{
	private int num;
	
	public Thread2(int num)
	{
		this.num=num;
	}
	public void run()
	{
		for(int i=0; i<=10 ; i++)
		{
			int res = num * i ;
			System.out.println(num + "*" + i + "=" + res);
		}
		System.out.println("==========================");
	}
	public static void main(String[] args) {
		Thread2 task1 = new Thread2(2);
		Thread2 task2 = new Thread2(3);
		Thread2 task3 = new Thread2(4);
		Thread2 task4 = new Thread2(5);
		task1.start();
		task2.start();
		task3.start();
		task4.start();
	}
}
