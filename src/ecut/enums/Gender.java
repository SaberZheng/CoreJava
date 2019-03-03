package ecut.enums;

/**
 * 所有的枚举常量必须 列在 枚举类的 首行 ( 第一个 分号之前 )
 * 所有的枚举常量 直接写 常量名称即可 ( 默认全部是 public static final )
 * 多个枚举常量之间 用 逗号 隔开
 * 所有的枚举常量在声明时已经默认调用了相应的构造方法
 * 
 * public static final Gender MALE = new Gender( "靓仔" );
 * 
 *所有的 枚举类型 都继承自 java.lang.Enum
 * 
 */
public enum Gender {
	FEMALE( "靓妹") ,
	MALE( "靓仔" )
	;
	private String genderName  ;
	
	private Gender( String name ){
		System.out.println( "Gender");
		this.genderName = name ;
	}

	public String getGenderName() {
		return genderName;
	}
	
}
