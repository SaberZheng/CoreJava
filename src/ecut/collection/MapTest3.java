package ecut.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * keySet()
 * values()
 * entrySet()
 */
public class MapTest3 {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		
		map.put( "软件工程" , 500 );
		map.put( "通信工程" , 200 );
		map.put( "土木工程" , 100 );
		map.put( "幼儿教育" , 300 );
		map.put( "护士护理" , 600 );
		
		// 返回此映射中包含的键的 Set 视图
		Set<String> keys = map.keySet(); // 所有的 key 组成的 Set 集合
		for( String key  : keys ) {
			Integer value = map.get( key );
			System.out.println( key + " : " + value );
		}
		
		System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~" );
		
		// 返回此映射中包含的值的 Collection 视图
		Collection<Integer> values =  map.values();
		
		for( Integer v  : values ) {
			System.out.println( v );
		}
		
		System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~" );
		
		// 返回此映射中包含的映射关系的 Set 视图
		Set< Map.Entry<String, Integer> > entries =  map.entrySet();
		
		for(  Map.Entry<String, Integer> entry : entries ){
			System.out.println( entry.getKey() + " : " + entry.getValue() );
		}
		
	}

}
