package ecut.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest2 {

	public static void main(String[] args) {
		
		// 以 输出 deque 的字符串形式 的 "右侧" 为头
		Deque<String> deque = new LinkedList<>();
		//将指定的元素插入此双端队列的开头
		deque.offerFirst( "曹操" ) ;  
		
		deque.offerFirst( "曹丕" );
		
		deque.offerFirst( "曹爽" );
		
		deque.offerFirst( "司马炎" );
		
		System.out.println( deque );
		//获取并移除此双端队列的最后一个元素；如果此双端队列为空，则返回 null。 
		String head = deque.pollLast();
		System.out.println( "移除队列头: " + head );
		System.out.println( deque );
		
		head = deque.pollLast();
		System.out.println( "移除队列头: " + head );
		System.out.println( deque );
		
		head = deque.pollLast();
		System.out.println( "移除队列头: " + head );
		System.out.println( deque );
		//offerFirst插入的元素作为第一个
		//运行过程：
		//曹操
		//曹丕, 曹操
		//曹爽, 曹丕, 曹操
		//司马炎, 曹爽, 曹丕, 曹操
		// 以 输出 deque 的字符串形式 的 "右侧" 为头（第一个进入的元素）
		/*[司马炎, 曹爽, 曹丕, 曹操]
		      移除队列头: 曹操
		  [司马炎, 曹爽, 曹丕]
		      移除队列头: 曹丕
		  [司马炎, 曹爽]
		      移除队列头: 曹爽
		  [司马炎]*/
		
	}

}
