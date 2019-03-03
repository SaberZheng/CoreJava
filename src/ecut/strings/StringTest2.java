package ecut.strings;

public class StringTest2 {

	public static void main(String[] args) {
		
		final char[] chars = { '春' , '眠' , '不' , '觉' , '晓' };
		System.out.println( "chars: " + System.identityHashCode( chars ) );
		
		String s = new String( chars );
		System.out.println( "s : " + System.identityHashCode( s ) );
		
		System.out.println( s );
		
		String x = s.intern(); // 返回规范化表示形式
		
		System.out.println( "s.intern : " + System.identityHashCode( x ) );
		
		System.out.println( s == x ); // true
		
		String r = "春眠不觉晓";
		System.out.println( s == r );
		
	}

}
