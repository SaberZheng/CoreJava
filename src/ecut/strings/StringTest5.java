package ecut.strings;

/**
 * 当 字符串 变量 参与 串联 操作时
 * 是通过 StringBuilder ( 或 StringBuffer ) 类及其 append 方法实现的
 */
public class StringTest5 {

	public static void main(String[] args) {
		
		String a = "abc" ;
		String b = "xyz";
		
		String d = "abcxyz" ;
		// 两个字符串字面值 通过 + 串联，直接在 池中完成
		String c = "abc" + "xyz" ; // + 是 "串联" 作用

		System.out.println( c == d );
		
		System.out.println( "~~~~~~~~~~~~~~" );
		
		// 字符串串联是通过 StringBuilder ( 或 StringBuffer ) 类及其 append 方法实现的
		// 1、StringBuilder sb = new StringBuilder( a );
		// 2、sb.append( b ) ;
		// 3、sb.toString() ---> new String( chars )
		String e = a + b ;
		System.out.println( e == c );
		System.out.println( e == d );
		
		String f = e.intern();
		
		System.out.println( f == d );
		//JAVA编译器对string + 基本类型/常量 是当成常量表达式直接求值来优化的。  运行期的两个string相加，会产生新的对象的，存储在堆(heap)中 
		String g = a + "xyz" ;//a为变量，在运行期才会被解析。 
		System.out.println( g == c );
		
		final String h = "abc" ;
		String i = h + "xyz" ;
		System.out.println( i == c );//h为常量，编译期会被优化  
		
	}

}
