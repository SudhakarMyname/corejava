package OOps_constructor;

public class Parameterized {
	
	private int uid;
	private String username;
	private String password;
	private boolean accountExpired;
	
	 Parameterized(int uid, String username, String password, boolean accountExpired){
	    this.	uid=uid;
		this.username=username;
		this.password=password;
		this.accountExpired=accountExpired; 
		
	}
	void show()
	{
		System.out.println(uid);
		System.out.println(username);
		System.out.println(password);
		System.out.println(accountExpired);
	}
	
}
