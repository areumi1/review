package singleton;
/**** Singleton pattern ******/
public class DBConnect {
	
	private DBConnect() {
		System.out.println("실제 디비 연결");
	}
	
	private static DBConnect con;  // con = null;
	
	public static DBConnect getInstance() {		// 객체 생성 없이 접근하고 싶어서 생성 
		if (con == null) {
		con = new DBConnect();
		}
		return con;
	}

}
