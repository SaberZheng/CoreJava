package ecut.strings;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		
		builder.append( "a" );
		builder.append( "b" );
		builder.append( "c" );
		builder.append( "d" );
		builder.append( "e" );
		
		System.out.println( builder );
		
		String r = builder.toString();
		System.out.println( r );
		//将此字符序列用其反转形式取代
		builder.reverse();
		
		System.out.println( builder );

	}

}
