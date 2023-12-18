package algorithm.code.java.p02.lc49;

import java.util.*;
import java.util.logging.Logger;

public class Code {
    private Map letter = new HashMap<Character, Long>() {{
        put('a', 2L);
        put('b', 3L);
        put('c', 5L);
        put('d', 7L);
        put('e', 11L);
        put('f', 13L);
        put('g', 17L);
        put('h', 19L);
        put('i', 23L);
        put('j', 29L);
        put('k', 31L);
        put('l', 37L);
        put('m', 41L);
        put('n', 43L);
        put('o', 47L);
        put('p', 53L);
        put('q', 59L);
        put('r', 61L);
        put('s', 67L);
        put('t', 71L);
        put('u', 73L);
        put('v', 79L);
        put('w', 83L);
        put('x', 89L);
        put('y', 97L);
        put('z', 101L);
    }};

    public List<List<String>> groupAnagrams(String[] strs) {
//        List ans = new ArrayList<String>();
//        Map map = new HashMap<Long, List<String>>();
//
//        for (int i = 0; i < strs.length; i++) {
//            long v = 1;
//            for (int j = 0; j < strs[i].length(); j++) {
//                char c = strs[i].charAt(j);
//                v += (Long) letter.get(c);
//            }
//            List list = (List) map.getOrDefault(v, new ArrayList<String>());
//            list.add(strs[i]);
//            map.put(v, list);
//
//        }
//        ans = map.values().stream().toList();
//        return ans;

        Map map = new HashMap<String, ArrayList<String>>();
        for (int i = 0; i < strs.length; i++) {
            // 排序字符串
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);

            // 放入 Map 中
            List list = (List) map.getOrDefault(str, new ArrayList<String>());
            list.add(strs[i]);
            map.put(str,list);

        }
        return new ArrayList(map.values());
    }
}
