package ecut.collection;

import java.util.HashMap;

public class HashMapTest {
	// load factor负载因子
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>(20, 0.8F);
		/**
		 * this.loadFactor = loadFactor; this.threshold = tableSizeFor(
		 * initialCapacity );
		 **/

		// 因为 HashMap 内部用 哈希表来存储 键值对
		// 并且 HashMap 采用 key 的hashCode 来确定 键值对 在哈希表中的位置
		// 因此，添加键值对的顺序，跟它们在哈希表中的存放位置可能不同
		map.put("软件工程", 500);
		map.put("通信工程", 200);
		map.put("土木工程", 100);
		map.put("幼儿教育", 300);
		map.put("护士护理", 600);

		map.put("东理", 600);
		map.put("两猎", 600);
		map.put("二晶", 600);
		map.put("伍囗", 600);
		map.put("住仙", 600);

		System.out.println(map);

		int capacity = MapHelper.capacity(map);
		System.out.println("HashMap实例内部的哈希表的长度: " + capacity);

		int index = MapHelper.position(map, "护士护理");
		System.out.println("元素在哈希表中的存放位置: " + index);

		MapHelper.show(map);

	}

}
