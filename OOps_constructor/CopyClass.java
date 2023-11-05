package OOps_constructor;

public class CopyClass {
	private int uid;
	private String username;
	private String password;
	
	public CopyClass(int arg1, String arg2, String arg3) {
		uid = arg1;
		username=arg2;
		password=arg3;
	}
	public CopyClass(CopyClass arg) {
		this.uid= arg.uid;
		this.username=arg.username;
		this.password=arg.password;
	}
	public void show() {
		System.out.println(uid);
		System.out.println(username);
		System.out.println(password);
	}
	

}
