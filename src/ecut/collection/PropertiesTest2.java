package ecut.collection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 1、从类路径下获得任意资源对应的输入流
 * 2、用 Properties 加载 属性文件 ( 以 .properties 为后缀，其中的内容形式是 key = value )
 */
public class PropertiesTest2 {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		System.out.println( "属性个数: " + props.size() );
		
		Class<?> c = PropertiesTest2.class ; // 任何一个类型都可以 通过 .class 来获得自己的类型对应 Class 对象
		// 通过 java.lang.Class 类的 getResourceAsStream 方法获得指定资源名称对应的输入流
		// 如果仅仅指定的是 文件名，则该文件必须跟 当前类在同一个包因此c.getResourceAsStream( "jdbc.properties" ) ;返回null
		// 如果在 文件名之前使用了 / 则表示 从 当前的 类路径 的根路径开始寻找
		InputStream inStream = c.getResourceAsStream( "/jdbc.properties" ) ;
		
		try {
			props.load( inStream ); // 从指定的流中读取 属性 ，并加入到 属性集合 中
		} catch (IOException e) {
			System.err.println( "加载失败: " + e.getMessage() );
		} catch( NullPointerException e ) {
			System.err.println( "未找到文件: " + e.getMessage() );
		}
		
		if( props.size() > 0 ) {
			System.out.println( props.getProperty( "jdbc.url" ) );
			System.out.println( props.getProperty( "jdbc.driver" ) );
			System.out.println( props.getProperty( "jdbc.user" ) );
			System.out.println( props.getProperty( "jdbc.password" ) );
		}
		
	}

}
