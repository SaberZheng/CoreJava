package ecut.collection;

import java.util.LinkedList;

/**
 * 将 LinkedList 当作 "栈" 来使用
 * 栈:  后进先出 ( Last In , First Out , LIFO )
 */
public class LinkedListStackTest {

	public static void main(String[] args) {
		
		LinkedList<String> s = new LinkedList<>();
		
		s.push( "Java" );
		
		s.push( "C++" );
		
		s.push( "Go" );
		
		System.out.println( s );
		
		String top = s.peek() ; // 检查栈顶元素 ( 只获取不删除 )
		System.out.println( top );
		
		System.out.println( s );
		
		top = s.pop(); // 弹出栈顶元素 ( 获取并移除 )
		System.out.println( top );
		System.out.println( s );
		
		top = s.pop(); // 弹出栈顶元素 ( 获取并移除 )
		System.out.println( top );
		System.out.println( s );
		
		top = s.pop(); // 弹出栈顶元素 ( 获取并移除 )
		System.out.println( top );
		System.out.println( s );

	}

}
