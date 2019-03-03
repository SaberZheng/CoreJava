package ecut.strings;

public class StringBufferTest {

	public static void main(String[] args) {
		
		// s.value ==>  "abc".value ;
		// String s = "abcxyz";
		
		
		// char[] value = new char[ 3 + 16 ];
		// value[ 0 ] = 'a' ;  value[ 1 ] = 'b' ;  value[ 2 ] = 'c' ;
		StringBuffer sb = new StringBuffer( "abc" ); 
		
		// value[ 3 ] = 'x' ;  value[ 4 ] = 'y' ;  value[ 5 ] = 'z' ;
		sb.append( "xyz" );
		
		String x = sb.toString() ; 
		System.out.println( x );
		//返回字符串对象的规范化表示形式。
		String y = x.intern();
		
		System.out.println( x == y );
		
		System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~" );
		
		// 池中有几个串
		// "a"
		// "ab"
		// "abc"
		// "abcd"
		// "abcde"
		String str = "a" + "b" + "c" + "d" + "e" ;
		System.out.println( str );
		
		StringBuffer buffer = new StringBuffer();
		buffer.append( "a" );
		buffer.append( "b" );
		buffer.append( "c" );
		buffer.append( "d" );
		buffer.append( "e" );
		
		String r = buffer.toString();
		System.out.println( r );

	}

}
