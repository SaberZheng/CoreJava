package ecut.enums;

/**
 * "饿汉"式实现单例 ( Singleton )
 */
public class Moon {
	
	// 1、将所有构造方法私有 (无法在类外正常创建该类实例、该类无子类)
	private Moon(){
	}
	
	// 3、提供一个静态变量缓存那个惟一的实例
	private static final Moon MOON  = new Moon();

	// 2、通过静态方法来获得该类的惟一的实例
	public static Moon getInstance() {
		return MOON ;
	}
}
