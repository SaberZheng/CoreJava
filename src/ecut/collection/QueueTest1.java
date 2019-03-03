package ecut.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {

	public static void main(String[] args) {
		
		Queue<String> queue= new LinkedList<>();
		
		queue.add( "林冲" );
		
		queue.add( "晁盖" );
		
		queue.add( "武松" );
		
		System.out.println( queue );
		//queue.clear();
		//当无法获取到元素时，element 方法抛出 NoSuchElementException
		String head = queue.element() ; // 获取队列头部的元素，但不删除
		System.out.println( head );
		
		System.out.println( queue );
		//queue.clear();
		//当无法获取到元素时，remove 方法抛出 NoSuchElementException
		head = queue.remove(); // 获取并移除队列头部元素
		System.out.println( head );
		
		System.out.println( queue );

	}

}
