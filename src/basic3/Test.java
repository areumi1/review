package basic3;

public class Test {

	void method () throws MyException {
		// 일부러 예외발생
		throw new MyException();			

	}

	// 사용자 예외클래스
class MyException extends Exception{
	
	
}
	
}
