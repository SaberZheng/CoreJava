package ecut.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListTest2 {

	public static void main(String[] args) {
		
		List<Panda> list = new ArrayList<>(); // "菱形"语法
		
		list.add( new Panda( 100 , "桂花" ) );
		list.add( new Panda( 88 , "花菜" ) );
		list.add( new Panda( 200 , "团团" ) );
		list.add( new Panda( 99 , "圆圆" ) );
		
		System.out.println( list );
		
		// 创建一个用来比较 Panda 类型对象的 比较器 ( 裁判 )
		Comparator<Panda> c = new Comparator<Panda>(){
			@Override
			public int compare(Panda o1, Panda o2) {
				if( o1 != null && o2 != null ) {
					String name1 = o1.getName() ;
					String name2 = o2.getName();
					if( name1 != null ){
						// String 类实现了 Comparable 接口的 compareTo 方法
						return name1.compareTo( name2 );
					}
				}
				return 0;
			}
		};
		
		Collections.sort( list , c ); // 根据给定的比较器来排序
		
		System.out.println( list );
		
		
	}

}
