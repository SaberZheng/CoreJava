package ecut.enums;


/**
 * 实现多例 ( Multiton )
 */
public class Season {
	
	private int index ;
	private String name ;
	
	public static final Season SPRING = new Season( 1 , "春暖花开时" );
	public static final Season SUMMER = new Season( 2 , "热死你个鳖孙" );
	public static final Season AUTUMN = new Season( 3 , "又该吃月饼了" );
	public static final Season WINTER = new Season( 4 , "冻死你个XX" );
	
	private Season(int index, String name) {
		super();
		this.index = index;
		this.name = name;
	}

	public int getIndex() {
		return index;
	}
	
	public String getName() {
		return name;
	}

}
