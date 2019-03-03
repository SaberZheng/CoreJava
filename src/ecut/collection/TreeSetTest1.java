package ecut.collection;

import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		
		// 如果构造方法没有指定比较器，则根据元素的 自然顺序 排序
		// java.lang.String 支持 自然比较
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add( "张三丰" );
		ts.add( "张翠山" );
		ts.add( "殷素素" );
		ts.add( "张无忌" );
		ts.add( "谢逊" );
		ts.add( "赵敏" );
		ts.add( "张三丰" );
		
		System.out.println( ts );

	}

}
