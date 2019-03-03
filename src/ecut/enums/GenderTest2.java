package ecut.enums;

public class GenderTest2 {

	public static void main(String[] args) {
		
		Gender[] genders = Gender.values() ;
		int index = ( int )( Math.random() * 2 );
		
		Gender g = genders[ index ];
		
		switch ( g ) {
			case FEMALE:
				System.out.println( "万寿无疆" );
				break;
			case MALE:
				System.out.println( "一统江湖" );
				break;
		}
		
	}

}
