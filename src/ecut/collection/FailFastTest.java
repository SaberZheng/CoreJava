package ecut.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class FailFastTest {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put( "炒粉" , 3 );
		map.put( "炒面" , 5 );
		map.put( "包子" , 1 );
		map.put( "皮蛋瘦肉粥" , 2 );
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> itor = keySet.iterator();
		
		while( itor.hasNext() ){
			String key = itor.next() ;
			Integer value = map.get( key );
			System.out.println( key + " : " + value );
			// map.put( "罗玉凤" , 250 ); // 尽最大可能抛出 ConcurrentModificationException
			// map.remove( "包子" ); // 尽最大可能抛出 ConcurrentModificationException
			if( key.equals( "包子" )){
				//map.put(key, 5); //正在进行迭代的时候去修改元素可能抛 出 ConcurrentModificationException
				itor.remove(); // 不抛出 ConcurrentModificationException
			}
		}
		
		System.out.println( "~~~~~~~~~~~~~~~" );
		
		itor = keySet.iterator();

		while (itor.hasNext()) {
			String key = itor.next();
			Integer value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
	}

}
