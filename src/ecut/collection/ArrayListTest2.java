package ecut.collection;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); 
		
		list.add( 2 ); // auto-boxing : 2 ---> Integer.valueOf( 2 )
		list.add( 200 ) ;
		list.add( 3 ) ;
		list.add( 2 ) ;
		list.add( 20 );
		
		System.out.println( list );
		
		// T  remove( int index ) 是 List 接口定义的方法
		Integer removed = list.remove( 2 ); // 根据索引删除，而不是根据 Integer 对象删除
		System.out.println( "被删除的元素:" + removed );
		
		System.out.println( list );
		
		Object o = 2 ; // auto-boxing
		// boolean remove( Object o ) 是 Collection 接口定义的方法
		boolean result = list.remove( o ) ; // 根据元素来删除
		System.out.println( result );
		
		System.out.println( list );
		
	}

}
