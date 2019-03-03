package ecut.collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add( "猴哥" );
		
		list.add( "二师兄" );
		
		list.add( "老沙" );
		
		System.out.println( list );
		
		System.out.println( list.get( 2 ) );
		
		list.add( 1 , "白龙马" );
		
		System.out.println(  list );

	}

}
