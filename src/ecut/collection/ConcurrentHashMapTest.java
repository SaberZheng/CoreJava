package ecut.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ConcurrentHashMap 是 安全失败 ( fail-safe )
 * ConcurrentHashMap 支持完全的并发操作
 */
public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
		
		map.put( "炒粉" , 3 );
		map.put( "炒面" , 5 );
		map.put( "包子" , 1 );
		map.put( "皮蛋瘦肉粥" , 2 );
		
		Set< Map.Entry<String,Integer>  > entrySet = map.entrySet();
		
		Iterator< Map.Entry<String,Integer> > itor = entrySet.iterator();
		
		while( itor.hasNext() ){
			Map.Entry<String,Integer> entry = itor.next();
			System.out.println( entry.getKey() + " : " + entry.getValue() );
			map.put( "拌面" , 3 );
		}
		
		System.out.println( "~~~~~~~~~~~~~~~" );
		
		Enumeration<String> keys = map.keys();
		
		while( keys.hasMoreElements() ){
			String key = keys.nextElement();
			Integer value = map.get( key );
			System.out.println( key + " : " + value  );
			map.remove( "拌面" );
		}

	}

}
