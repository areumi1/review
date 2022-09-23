package singleton;
/**** Singleton pattern ******/
public class DBConnect {
	
	private DBConnect() {
		System.out.println("실제 디비 연결");
	}
	
	private static DBConnect con;  // con = null;	// 메소드명은 참조자료형 -> DBConnect 참조 자료형으로 자동 초기화 null값 
	
	public static DBConnect getInstance() {		// 객체 생성 없이 접근하고 싶어서 생성 
		if (con == null) {
		con = new DBConnect();
		}
		return con;
	}

}
