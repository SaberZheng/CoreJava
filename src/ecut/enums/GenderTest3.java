package ecut.enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class GenderTest3 {
	public static void main(String[] args) {
        // EnumSet的使用
        EnumSet<Gender> genderSet = EnumSet.allOf(Gender.class);
        for (Gender gender : genderSet) {
            System.out.println(gender);
        }
 
        // EnumMap的使用
        EnumMap<Gender, String> genderMap = new EnumMap<Gender, String>(Gender.class);
        genderMap.put(Gender.FEMALE, "妹纸");
        genderMap.put(Gender.MALE, "汉纸");
        // 迭代器遍历
        for (Iterator<Entry<Gender, String>> iter = genderMap.entrySet().iterator(); iter.hasNext();) {
            Entry<Gender, String> entry = iter.next();
            System.out.println(entry.getKey().name() + ":" + entry.getValue());
        }
    }
}
