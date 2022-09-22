package basic.temp.test;

import java.awt.*;

public class Test1 {
	
	Frame f;	// null	객체
	
	Test1(){			// 기본생성자
		f = new Frame("나의 첫 창");	 // 객체 생성시 메모리에 올려야함.
	}
	
	void addLayout() {
		f.setBounds(100,100,300,260);
		f.setVisible(true);
	}

	public static void main(String[] args) {


		Test1 t1 = new Test1();
		t1.addLayout();

	}

}
