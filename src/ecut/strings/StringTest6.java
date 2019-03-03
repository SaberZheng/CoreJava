package ecut.strings;

import java.util.Arrays;

/**
 */
public class StringTest6 {

	public static void main(String[] args) {
		
		String s = "How old are you ? " ;
		System.out.println("1、求字符串长度");
		int len = s.length();
		System.out.println("字符串的长度"+len);
		System.out.println("2、求字符串某一位置字符");
		char ch = s.charAt(2);//索引范围为从 0 到 length() - 1。
		System.out.println("字符串第2+1个字符是"+ch);
		System.out.println("3、提取子串");
		String s1 = s.substring(2, 5);//beginIndex - 起始索引（包括） endIndex - 结束索引（不包括）。 
		String s2 = s.substring(18);//beginIndex 大于0小于等于String对象的长度，等于时返回空串。 
		System.out.println("子串s1为:"+s1);
		System.out.println("子串s2为"+s2);
		System.out.println("4、字符串比较");
		String str1 = new String("abc");
		String str2 = new String("ABC");
		int a = str1.compareTo(str2);//若当前对象比参数大则返回正整数，反之返回负整数，相等返回0。
		int b = str1.compareToIgnoreCase(str2);//忽略大小写
		System.out.println("若当前对象比参数大则返回正整数，反之返回负整数，相等返回0");
		boolean c = str1.equals(str2);//c=false
		boolean d = str1.equalsIgnoreCase(str2);//d=true
		System.out.println("比较当前字符串和参数字符串，在两个字符串相等的时候返回true，否则返回false。");
		System.out.println("5、字符串中单个字符查找");
		int in = s.indexOf('y');
		System.out.println("字符串中y的位置"+in);
		System.out.println("6、字符串中字符的大小写转换");
		String str3 = s.toLowerCase();
		String str4 = s.toUpperCase();
		System.out.println("转换为小写为"+str3);
		System.out.println("转换为大写为"+str4);
		System.out.println("7、字符串中字符的替换");
		String str5 = s.replace('o', 'a');
		System.out.println("a替换o后为"+str5);
		System.out.println("8、字符串连接");
		String str6 = s.concat(str1);
		System.out.println("str1和s连接后为"+str6);
		System.out.println("9、截去字符串两端的空格");
		String str7 = s.trim();
		System.out.println("s截去字符串两端的空格,但对于中间的空格不处理后为"+str7);
		System.out.println("10、比较起始字符或结尾字符是否一致");
		s.startsWith("a");
		System.out.println("用来比较当前字符串的起始字符或子字符串prefix和终止字符或子字符串suffix是否和当前字符串相同，重载方法中同时还可以指定比较的开始位置offset。");
		System.out.println("11、作为分隔符进行字符串分解");
		String[] str8 = s.split(" ");
		for( String str : str8 ) {
			System.out.println(str);
		}
		System.out.println("12、判断是否包含字符串");
		s.contains("ow");
		System.out.println("判断参数是否被包含在字符串中，并返回一个布尔类型的值。");
		System.out.println("13、字符串转换为基本类型");
		int e = Integer.parseInt("12");
		float f = Float.parseFloat("12.34");
		double g = Double.parseDouble("1.124");
		System.out.println("e="+e+",f="+f+",g="+g);
		System.out.println("14、基本类型转换为字符串");
		String str9 = String.valueOf(12);
		System.out.println("str9为"+str9);
		System.out.println("15、将字符从此字符串复制到目标字符数组。 ");
		char[] chars = new char[ 10 ];
		System.out.println( chars[ 0 ] == '\u0000' );
		// 将字符串中的 [ 4 , 7 )之间的字符 复制到 chars 数组的下标是5的位置开始
		s.getChars( 4  , 7 , chars , 5 );
		System.out.println("将字符串中的 [ 4 , 7 )之间的字符 复制到 chars 数组的下标是5的位置开始 ");
		System.out.println( Arrays.toString( chars ) );
	}

}
