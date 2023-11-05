package Practice;

public class DriverManagaer {

	private static Driver driver;
	
	public static void registerDrive(Driver d)
	{
		driver = d;
	}

	public static void getConnection()
	{
		driver.connect();
	}
	
}
