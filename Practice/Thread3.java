package Practice;

public class Thread3 implements Runnable {

	private int num;
	
	public Thread3(int num)
	{
		this.num = num;
	}
	
	public void run() {
	
		for(int i=1 ; i<=10 ; i++)
		{
			int res = num * i;
			System.out.println(num + "*" + i + "=" + res);
		}
			System.out.println("=========================");
	}
	
	
	public static void main(String[] args) {
		
	Thread th1 =  new Thread (new Thread3(20));	
	Thread th2 =  new Thread (new Thread3(30));	
	Thread th3 =  new Thread (new Thread3(40));	
	Thread th4 =  new Thread (new Thread3(50));	
	
	th1.start();
	th2.start();
	th3.start();
	th4.start();
		
		
	}

	

}
