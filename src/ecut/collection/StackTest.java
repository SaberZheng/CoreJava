package ecut.collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		System.out.println( stack.empty() );
		
		stack.push( "first" );
		stack.push( "second" );
		stack.push( "third" );
		
		System.out.println( stack );
		
		String top = stack.peek();
		System.out.println( "top : " + top );
		System.out.println( stack );
		
		top = stack.pop();
		System.out.println( "top : " + top );
		System.out.println( stack );
		
		System.out.println( stack.empty() );
		
		int index = stack.search( "first" ); // 返回对象在堆栈中的位置，以 1 为基数（只有jdbc和stack.search以 1 为基数）
		System.out.println( index );
		
	}

}
