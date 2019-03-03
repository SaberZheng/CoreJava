package ecut.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest1 {

	public static void main(String[] args) {
		
		List<Panda> list = new ArrayList<>();
		
		list.add( new Panda( 100 , "桂花" ) );
		list.add( new Panda( 88 , "花菜" ) );
		list.add( new Panda( 200 , "团团" ) );
		list.add( new Panda( 99 , "圆圆" ) );
		
		System.out.println( list );
		
		Collections.sort( list );
		
		System.out.println( list );
		
		
	}

}
