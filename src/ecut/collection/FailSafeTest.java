package ecut.collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class FailSafeTest {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> table = new Hashtable<>(); // Alt + Shift + R 快速修改某个变量的名称
		
		table.put( "炒粉" , 3 );
		table.put( "炒面" , 5 );
		table.put( "包子" , 1 );
		table.put( "皮蛋瘦肉粥" , 2 );
		
		Enumeration<String> keys = table.keys();
		
		while( keys.hasMoreElements() ){
			String key = keys.nextElement();
			Integer value = table.get( key );
			System.out.println( key + " : " + value  );
			table.put( "拌面" , 3 );
		}

		
		System.out.println( "~~~~~~~~~~~~~~~" );
		
		keys = table.keys();
		
		while( keys.hasMoreElements() ){
			String key = keys.nextElement();
			Integer value = table.get( key );
			System.out.println( key + " : " + value  );
		}
		
	}

}
