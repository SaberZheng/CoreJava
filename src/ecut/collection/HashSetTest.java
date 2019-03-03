package ecut.collection;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add( "张三丰" );
		set.add( "张翠山" );
		set.add( "殷素素" );
		set.add( "张无忌" );
		set.add( "谢逊" );
		set.add( "赵敏" );
		
		set.add( "张三丰" );
		
		set.add( null );
		
		System.out.println( set );

	}

}
