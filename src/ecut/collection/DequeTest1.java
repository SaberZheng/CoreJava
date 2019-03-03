package ecut.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTest1 {

	public static void main(String[] args) {
		
		// 以 输出 deque 的字符串形式 的 "左侧" 为头
		Deque<String> deque = new LinkedList<>();
		//将指定的元素插入此双端队列的末尾
		deque.offerLast( "曹操" ) ;  
		
		deque.offerLast( "曹丕" );
		
		deque.offerLast( "曹爽" );
		
		deque.offerLast( "司马炎" );
		
		System.out.println( deque );
		//获取并移除此双端队列的第一个元素；如果此双端队列为空，则返回 null。 
		String head = deque.pollFirst();
		System.out.println( "移除队列头: " + head );
		System.out.println( deque );
		
		head = deque.pollFirst();
		System.out.println( "移除队列头: " + head );
		System.out.println( deque );
		
		head = deque.pollFirst();
		System.out.println( "移除队列头: " + head );
		System.out.println( deque );
		//offerLast插入的元素作为最后一个
		//运行过程：
		//曹操
		//曹操, 曹丕
		//曹操, 曹丕, 曹爽
		//曹操, 曹丕, 曹爽, 司马炎
		// 以 输出 deque 的字符串形式 的 "左侧" 为头（第一个进入的元素）
		//运行结果
		/*[曹操, 曹丕, 曹爽, 司马炎]
		     移除队列头: 曹操
		  [曹丕, 曹爽, 司马炎]
		      移除队列头: 曹丕
		  [曹爽, 司马炎]
		     移除队列头: 曹爽
		  [司马炎]*/
		
	}

}
