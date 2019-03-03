package ecut.collection;

import java.util.Properties;

public class PropertiesTest1 {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		
		 // props.put(key, value) ;
		props.setProperty( "driver", "com.mysql.jdbc.Driver" );
		props.setProperty( "url" , "jdbc:msyql://127.0.0.1:3306/ecut" );
		
		// props.get(key);
		String d = props.getProperty( "driver" );
		System.out.println( d );
		
		String user = props.getProperty( "user" );
		System.out.println( user );
		
		// 当指定的属性名在集合中不存在时，使用 第二个参数 当作默认值返回
		user = props.getProperty( "user" , "root" );
		System.out.println( user );
		
	}

}
