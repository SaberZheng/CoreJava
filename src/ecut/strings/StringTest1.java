package ecut.strings;

public class StringTest1 {

	public static void main(String[] args) {
		
		// 所有的 "" 包起来的 字符串 字面值一律放在 字符串常量池中
		//去字符串常量池池寻找相同内容的字符串，如果存在就直接拿出来应用，如果不存在则创建一个新的字符串放在常量池中。
		String s = "hello,ecut" ;
		System.out.println( System.identityHashCode( s ) );
		//通过 new关键字创建 String 对象，每次调用都会创建一个新的对象。
		String x = new String( "hello,ecut" );
		System.out.println( System.identityHashCode( x ) );
		
		System.out.println( s == x );
		
		// 返回字符串对象的规范化表示形式
		// 如果池已经包含一个等于此 String 对象的字符串(用 equals(Object) 方法确定)，则返回池中的字符串。
		// 否则，将此 String 对象添加到池中，并返回此 String 对象的引用(加入到池中以后的那个串的地址)
		String str = x.intern();
		System.out.println( System.identityHashCode( str ) );
		
		System.out.println( str == s );
		
		
	}

}
