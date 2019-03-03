package ecut.enums;

public class GenderTest1 {

	public static void main(String[] args) {
		
		Gender g = Gender.FEMALE ;
		
		System.out.println( g.getGenderName() );
		
		// 所有的枚举类型 都有一个 valueOf 方法
		// 该方法可以根据给定的 枚举常量的名称 获得 相应的枚举常量
		g = Gender.valueOf( "MALE" );
		
		System.out.println( g.getGenderName() );
		
		// 所有的枚举类型 都有一个 values 方法 返回该枚举类内部的所有枚举常量
		Gender[] gs = Gender.values();
		for( Gender e : gs ) {
			System.out.println( e.ordinal() + " , " + e.name() + " , " + e.getGenderName() );
		}

	}

}
