package Practice;

public class Thread_1 {
	
	private int num;
	public Thread_1(int num) {
		this.num=num;
	}
	
	public void generateTable()
	{
		for(int i=0; i <= 10 ; i++)
		{	
			int res = num*i;
			System.out.println(num + "*" + i + "=" + res);
		}
		System.out.println("===============================");
	}
	
	public static void main(String[] args) {
		Thread_1 task1 = new Thread_1(2);
		Thread_1 task2 = new Thread_1(4);
		Thread_1 task3 = new Thread_1(6);
		Thread_1 task4 = new Thread_1(8);

		task1.generateTable();
		task2.generateTable();
		task3.generateTable();
		task4.generateTable();
		
		
	}

}
