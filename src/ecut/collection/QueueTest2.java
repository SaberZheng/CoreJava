package ecut.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest2 {

	public static void main(String[] args) {
		
		Queue<String> queue= new LinkedList<>();
		
		queue.offer( "林冲" );
		
		queue.offer( "晁盖" );
		
		queue.offer( "武松" );
		
		System.out.println( queue );
		
		queue.clear();
		
		// 当无法获取元素时，返回 null，不会抛出异常
		String head = queue.peek() ; // 获取队列头部的元素，但不删除
		System.out.println( head );
		
		System.out.println( queue );
		
		// 当无法获取元素时，返回 null，不会抛出异常
		head = queue.poll(); // 获取并移除队列头部元素
		System.out.println( head );
		
		System.out.println( queue );

	}

}
