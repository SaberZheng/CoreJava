package ecut.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest1 {
	
	public static void main(String[] args) {
		int[] x = { 1 , 2 };
		
		System.out.println( Arrays.toString( x ) );
		
		// x.length = 10 ; // The final field x.length cannot be assigned
		
		// x[ 2 ] = 3 ; // ArrayIndexOutOfBoundsException
		
		ArrayList<String> list = new ArrayList<>(0); // JDK 1.7 开始支持 "菱形" 语法
		
		System.out.println( list ); // list.toString()
		list.add( "hello" );
		System.out.println( list );
		list.add(1, "ff ");
		System.out.println( list );
		
		
	}
}
