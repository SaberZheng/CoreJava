package ecut.collection;

import java.util.TreeMap;

public class TreeMapTest1 {

	public static void main(String[] args) {
		
		// 创建 TreeMap 对象时，如果没有指定比较器，则默认按照 key 的 自然顺序排序
		TreeMap<Fox,Double> tm = new TreeMap<>();
		
		Fox fox1 = new Fox( 100 , "妲己" );
		tm.put( fox1 ,  1.0 );
		
		Fox fox2 = new Fox( 200 , "褒姒" );
		tm.put( fox2 ,  0.8 );
		
		System.out.println( tm );
		
		Fox fox3 = new Fox( 150 , "金角大王他干娘" );
		tm.put( fox3 ,  100.0 );
		
		System.out.println( tm );
		
	}

}
