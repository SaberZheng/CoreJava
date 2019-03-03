package ecut.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		
		// map 变量的值 不是 null
		// map 集合中没有放入 任何键值对时，isEmpty 返回 true
		Map<String,Integer> map = new HashMap<>();
		
		System.out.println( "size : " +  map.size() + " , isEmpty : " + map.isEmpty() );
		
		map.put( "软件工程" , 500 );
		map.put( "通信工程" , 200 );
		map.put( "土木工程" , 100 );
		
		System.out.println( "size : " +  map.size() + " , isEmpty : " + map.isEmpty() );
		
		System.out.println( map );
		
		// 删除指定的 key 对应的 key-value 对，并返回 该 key 对应的 value
		Integer value = map.remove( "土木工程" );
		System.out.println( value );
		
		System.out.println( map );
		
		map.clear();
		
		System.out.println( "size : " +  map.size() + " , isEmpty : " + map.isEmpty() );
		
		map.put( "信息科学技术" , 100 );
		
		Map<String,Integer> m = new HashMap<>();
		m.put( "幼儿教育" , 5000 );
		m.put( "信息科学技术" , 150 );
		System.out.println( m );
		
		map.putAll( m );
		
		System.out.println( map );
		
	}

}
