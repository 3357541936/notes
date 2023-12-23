package algorithm.code.java.p02.lc811;

import java.util.*;

// 使用哈希表的方式, 将访问的子域名作为键名, 访问次数作为键值计数
public class Code {
    private Map<String, Integer> map = new HashMap<>();
    public List<String> subdomainVisits(String[] cpdomains) {
        for (String str : cpdomains) {
            String[] arr = str.split(" ");
            String[] domains = arr[1].split("\\.");
            int c = Integer.parseInt(arr[0]);

            for (int i = 0; i < domains.length; i++) {
                String[] key = Arrays.copyOfRange(domains, i, domains.length);
                String domain = String.join(".", key);
                if (map.containsKey(domain)) {
                    int count = map.get(domain);
                    map.put(domain, count + c);
                } else
                    map.put(domain, c);
            }
        }
        List list = new ArrayList();
        for (String s :
                map.keySet()) {
            list.add(map.get(s) + " " + s);
        }
        return list;
    }
}
