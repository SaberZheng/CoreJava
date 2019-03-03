package ecut.collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		//以前与 key 关联的值，如果没有针对 key 的映射关系，则返回 null。
		Integer value = map.put( "Java从入门到精通" , 98 );
		System.out.println( "value : " + value );
		
		// 将指定的值(value)与此映射中的指定键(key)关联
		value = map.put( "Java从入门到精通" , 108 );
		System.out.println( "value : " + value );
		
		// 返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null
		System.out.println( map.get( "Java从入门到精通" ) );
		
		System.out.println( map.containsKey( "Java从入门到精通" ) );
		System.out.println( map.containsKey( "Oracle从入门到精通" ) );
		
		System.out.println( map.containsValue( 108 ) );
		
		map.put( "C++大学教程" , 108 );
		
		map.put( "A语言大学教程" , 108 );
		
		System.out.println( map );
		
		
	}

}
