package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		
		// 1. 스택 // 마지막에 들어간 값이 먼저 나온다. 더 중요!
		// 보통 웹 사이트에서 뒤로가기 할때 사용
		
		Stack s = new Stack();
		s.push("A"); // 넣는 구조를 push 라고함
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop()); // .pop 데이터를 뽑음
		
		// 2. 큐 // 먼저 들어간 값이 먼저 나온다.
		
		//Queue q = new Queue();	// Queue 는 객체생성을 할수 없음 // 인터페이스// 100%추상
		Queue q = new LinkedList();  // 자식객체로 객체생성
		q.offer("A");
		q.offer("B");
		q.offer("C");		// 넣는 구조를 poffer 라고함
		
		System.out.println(q.poll());// .poll 데이터를 뽑음
		
	}

}
