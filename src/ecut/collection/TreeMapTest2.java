package ecut.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest2 {

	public static void main(String[] args) {
		
		Comparator<Fox> c = new Comparator<Fox>(){
			@Override
			public int compare( Fox o1, Fox o2 ) {
				if( o1 != null && o2 != null && o1.getName() != null && o2.getName() != null ){
					String name1 = o1.getName() ;
					String name2 = o2.getName() ;
					return  name1.compareTo( name2 ) ;
				}
				return 0;
			}
		};
		
		// 创建 TreeMap 对象时，指定比较器，则按照 比较器 排序
		TreeMap<Fox,Double> tm = new TreeMap<>( c );
		
		Fox fox3 = new Fox( 150 , "金角大王他干娘" );
		tm.put( fox3 ,  100.0 );
		System.out.println( tm );
		
		Fox fox2 = new Fox( 200 , "褒姒" );
		tm.put( fox2 ,  0.8 );
		System.out.println( tm );
		
		Fox fox1 = new Fox( 100 , "妲己" );
		tm.put( fox1 ,  1.0 );
		System.out.println( tm );
		
	}

}
