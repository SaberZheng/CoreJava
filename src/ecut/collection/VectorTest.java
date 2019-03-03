package ecut.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		// 创建一个 Vector 实例，其初始容量为 10 ，容量的增量为 5
		Vector<String> v = new Vector<>( 10 , 5 );
		
		v.add( "hello" );
		
		v.addElement( "world" );
		
		System.out.println( v );
		
		v.add( 1 , "你好" );
		
		System.out.println(  v );
		
		v.insertElementAt( "世界" , 2 );
		
		System.out.println( v );
		
		Enumeration<String> e =  v.elements();
		
		while( e.hasMoreElements() ) {
			String s = e.nextElement();
			System.out.println( s );
		}

	}

}
