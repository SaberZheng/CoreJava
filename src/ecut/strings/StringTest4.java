package ecut.strings;

import java.util.Arrays;

//  对于中文来说 UTF-8 编码可以是 2~3 个字节 (大部分都是3个字节)
public class StringTest4 {

	public static void main(String[] args) throws Exception {
		
		String s = "今天天气孬abc" ;
		System.out.println( s.length() );
	
		// byte[] bytes = s.getBytes(); // 采用默认编码
		byte[] bytes = s.getBytes( "UTF-8" );
		
		System.out.println( Arrays.toString( bytes ) );
		System.out.println( bytes.length );
		
		// String x = new String( bytes );
		String x = new String( bytes , "UTF-8");
		System.out.println( x );
		
	}

}
