package ecut.collection;

/**
 * 对于 Object # hashCode()  
 * 
 * 1、由 Object 类定义的 hashCode 方法确实会针对不同的对象返回不同的整数。
 *    （这一般是通过将该对象的内部地址转换成一个整数来实现的，但是 JavaTM 编程语言不需要这种实现技巧。）
 *    
 * 2、这个整数 与 System.identityHashCode 的返回值相同
 * 
 * 3、这个整数的意义:  Identity Hash Code ( 相当于 每个 对象的 身份证编号 )
 *      
 * 4、Object 提供 hashCode 方法是为了提高哈希表（例如 java.util.Hashtable 提供的哈希表）的性能
 * 
 * 5、这个整数 在第一次 访问时 才触发产生
 *
 */
public class IdentityHashCodeTest {

	public static void main(String[] args) {
		
		// 数组也是引用类型变量
		int[] a = new int[ 10 ];
		int[] b = new int[10] ;
		//返回该对象的哈希码值。
		System.out.println( "a : " + a.hashCode() );
		System.out.println( "b : " + b.hashCode() );
		//这个整数 与 System.identityHashCode 的返回值相同
		System.out.println( "b : " + System.identityHashCode( b ) );
		System.out.println( "a : " + System.identityHashCode( a ) );
		
		
		
	}

}
