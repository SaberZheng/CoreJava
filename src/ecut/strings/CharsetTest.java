package ecut.strings;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *  Java支持的字符集。
 *  常用字符编码:
 *  UTF-8 ( Unicode 的子集 )
 *  GBK ( GB2312 / GB18030 ) 中国大陆采用的简体汉字编码 
 *  Big5 繁体中文 (正体中文)
 *  ISO-8859-1
 */
public class CharsetTest {

	public static void main(String[] args) {
		//构造从规范 charset 名称到 charset 对象的有序映射。
		Map<String,Charset> map = Charset.availableCharsets();
		
		// 迭代 map 返回此映射中包含的键的 Set 视图。
		Set<String> keys = map.keySet();
		
		// foreach 循环中 可以处理的 对象有 数组 或 java.lang.Iterable 接口的实现类
		for( String key : keys ) {
			//返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
			Charset value = map.get( key );
			System.out.println( key + " : " + value );
		}
		
		//返回在此 set 中的元素上进行迭代的迭代器。
		Iterator<String> it =  keys.iterator();
		
		while( it.hasNext() ) {
			String key = it.next();
			Charset value = map.get( key ); // 根据 key 取出 value
			System.out.println( key + " : " + value );
		} 

	}

}
