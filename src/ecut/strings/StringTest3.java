package ecut.strings;

public class StringTest3 {

	public static void main(String[] args) {
		
		String r = "春眠不觉晓";
		System.out.println( "r : " + System.identityHashCode( r ) );
		
		final char[] chars = { '春' , '眠' , '不' , '觉' , '晓' };
		
		String s = new String( chars );
		System.out.println( "s : " + System.identityHashCode( s ) );
		
		String x = s.intern(); 
		System.out.println( "x : " + System.identityHashCode( x ) );
		
	}

}
