package ecut.collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 一个 Map 接口的实现类的自我修养:
 * 	   1、将键映射到值的对象 ( Map 集合中存放的是 key-value 对 ( Map.Entry ) )
	   2、一个映射不能包含重复的键 ( Map 集合中的 key 不能重复 )
	   3、每个键最多只能映射到一个值 ( Map 集合中的 key 只能对应一个 值 )
	   
	 Hashtable 的特点:
		1、key 和 value 都不能为 null  
		2、几乎所有的方法都是线程安全的( 几乎所有的方法都被 synchronized 修饰 )
		
 */
public class HashtableTest {
	
	public static void main(String[] args) {
		
		Hashtable<String,Integer> ht = new Hashtable<>();
		
		//ht.put(null, null);//抛出NullPointerException，key 和 value 都不能为 null  
		
		ht.put( "罗玉凤" , 250 );
		
		ht.put( "罗玉龙" , 500 );
		
		System.out.println( ht ); // ht.toString()
		
		System.out.println( ht.get( "罗玉龙" ) );
		
		Enumeration<String> keys =  ht.keys();
		
		while( keys.hasMoreElements() ){
			String key = keys.nextElement();
			Integer value = ht.get( key );
			System.out.println( key + " : " + value );
		}
		
	}

}
