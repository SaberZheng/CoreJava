package ecut.collection;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/***
 * hashCode 相同的字符串:
 *  重地 - 通话
 *  方面 - 树人
 *  玉班 - 王环 - 牛顿
 *  王八 - 玌兌
 *  东理 - 两猎 - 二晶 - 伍囗 - 住仙
 *  东华 - 世合
 *  德鹏 - 恢覚
 *  农丰 - 儿女
 *  掌门 - 文境 - 方創
 */
public class MapHelper {
	
	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>( 1 );
		//根据传入的 HashMap 实例获取其内部的 哈希表 的容量
		int c = capacity( map );
		System.out.println( "容量: " + c );
		
		map.put( "掌门" , "张三丰" );
		map.put( "方創" , "大众创业万众等死" );
		
		map.put( "农丰" , "三轮车" );
		map.put( "儿女" ,  "张无忌" );
		
		map.put( "重地" , "仓库重地" );
		map.put( "通话" , "通话记录");
		
		map.put( null , null );
		//显示给定 HashMap 实例内部的 哈希表中存储的数据 (只处理到链表层次)
		show( map );
		
		c = capacity( map );
		System.out.println( "容量: " + c );
		
		String key = "儿女" ;
		//计算指定的 key 在给定的 map 集合中的位置(在哈希表中的索引)
		int p = position(map, key );
		System.out.println( key + "在哈希表中的位置: " + p );
		
		key = null ;
		p = position(map, key);
		System.out.println( key + "在哈希表中的位置: " + p );
		
	}
	
	private static Class<?> hashMapClass ;
	private static Field tableField;
	private static Method hashMethod ;
	
	static {
		
		hashMapClass = HashMap.class;
		
		try {
			// 通过反射来获得 HashMap 内部的 table 属性
			tableField = hashMapClass.getDeclaredField( "table" );
			// 让本来因为被封装而不能访问的 table 能够被访问
			tableField.setAccessible( true );
			
			// 通过反射获得 HashMap 内部的 hash 方法
			hashMethod = hashMapClass.getDeclaredMethod( "hash" , Object.class );
			// 让本来因为封装而不能访问的 hash 方法能够被访问
			hashMethod.setAccessible( true );
			
		} catch (NoSuchFieldException e) {
			System.out.println( "在 " + hashMapClass.getName() + " 中未找到 table 属性 : " + e.getMessage() );
		} catch (SecurityException e) {
			System.out.println( "无法访问 " + hashMapClass.getName() + " 的 table 属性 : " + e.getMessage() );
		} catch (NoSuchMethodException e) {
			System.out.println( "在 " + hashMapClass.getName() + " 累中未找到 hash 方法 : " + e.getMessage() );
		}
		
	}
	
	/**
	 * 计算指定的 key 在给定的 map 集合中的位置(在哈希表中的索引)
	 * @param map
	 * @param key
	 * @return
	 */
	public static int position( HashMap<?,?> map , Object key ) {
		int position = -1 ;
		//获取 哈希表的容量
		int capacity = capacity( map );
		// 根据 键 计算哈希值
		int hash = hash( map , key );
		// 根据 HashMap 中的实现思路，计算 键 的存储位置
		position = ( capacity - 1 ) & hash ;
		
		return position ;
	}
	
	/**
	 * 计算指定的 key 的 hash 值
	 * @param map
	 * @param key
	 */
	public static int hash( HashMap<?,?> map , Object key ) {
		int hash = -1 ;
		try {
			/*Method getDeclaredMethod( String name , Class<?>... parameterTypes )获得由本类直接声明的指定名称、指定参数列表的方法对应的 Method 对象。
			hashMethod = hashMapClass.getDeclaredMethod( "hash" , Object.class );
			Object    invoke( Object target , Object... args ) 对带有指定参数的指定对象调用由此 Method对象表示的底层方法
			 通过反射调用 HashMap 中的 hash 方法*/
			Object h = hashMethod.invoke( map , key );//map.hash(key)
			if( h != null ) {
				// 判断 h 是否是 int 类型 或 Integer 类型
				if( h.getClass() == Integer.class || h.getClass() == int.class ) {
					hash = Integer.class.cast( h )  ; // 通过反射方法，实现强制类型转换
				}
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		return hash ;
	}
	
	/**
	 * 根据传入的 HashMap 实例获取其内部的 哈希表 的容量
	 * @param map
	 */
	public static int capacity( HashMap<?,?> map ) {
		int capacity = 0 ;
		try {
			// 获得给定的 map 实例 中的 table 属性的值 (获取到哈希表)
			//Object get(Object obj)返回指定对象上此 Field 表示的字段的值。
			Object value = tableField.get( map );
			
			if( value != null ){
				Class<?> valueClass = value.getClass(); // 获得 table 属性的 值 的类型
				if( valueClass.isArray() ){ // 如果是个数组
					capacity = Array.getLength( value ); // 获取数组长度 (获取哈希表的长度)
				}
			}
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return capacity ;
		
	}
	
	/**
	 * 显示给定 HashMap 实例内部的 哈希表中存储的数据 (只处理到链表层次)
	 * @param map
	 */
	public static void show( HashMap<?,?> map ) {
		
		try {
			// 从参数传入的 map 实例中获得 该实例中的 table 属性的值
			Object value = tableField.get( map );
			
			if( value != null ){
				Class<?> valueClass = value.getClass(); // 获得 table 属性的 值 的类型
				if( valueClass.isArray() ){ // 如果是个数组
					
					System.out.println( "HashMap 实例中的哈希表:" );
					
					StringBuffer buffer = new StringBuffer();
					
					// 遍历数组
					for( int i = 0 , n = Array.getLength( value ) ; i < n ; i++ ){
						buffer.setLength( 0 );
						Object e = Array.get( value ,  i ) ; // 从数组中获取 下标是 i 的元素
						if( e != null ){
							buffer.append( i ) ;
							buffer.append( " : " );
							// 获得 当前循环取得的 元素的类型
							Class<?> eClass = e.getClass();
							Field hashField = eClass.getDeclaredField( "hash" ); // 获得 eClass 中 名称是 hash 的属性
							hashField.setAccessible(true);
							buffer.append( "[ " );
							Field keyField = eClass.getDeclaredField( "key" ); // 获得 eClass 中 名称是 key 的属性
							keyField.setAccessible(true);
							Field valueField = eClass.getDeclaredField( "value" ); // 获得 eClass 中 名称是 key 的属性
							valueField.setAccessible(true);
							Field nextField = eClass.getDeclaredField( "next" ); // 获得 eClass 中 名称是 key 的属性
							nextField.setAccessible(true);
							
							Object hash = hashField.get( e );
							buffer.append( "<");
							buffer.append( hash );
							buffer.append( ">" );
							
							Object k = keyField.get( e );
							buffer.append( k );
							buffer.append( "=" );
							Object v = valueField.get( e );
							buffer.append( v );
							
							Object next = nextField.get( e );
							while( next != null ) {
								buffer.append( " , " );
								hash = hashField.get( e );
								k = keyField.get( next );
								v = valueField.get( next );
								buffer.append( "<");
								buffer.append( hash );
								buffer.append( ">" );
								buffer.append( k );
								buffer.append( "=" );
								buffer.append( v );
								next = nextField.get( next ) ; // 继续获得下一个节点
							}
							
							buffer.append( " ]" );
						} else {
							buffer.append( i );
							buffer.append( " : [ empty ]" );
						}
						
						System.out.println( buffer.toString() );
						
					}// end of for loop
				}
			} else {
				System.out.println( "null");
			}
			
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}

}
