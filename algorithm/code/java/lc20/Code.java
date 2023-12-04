package algorithm.code.java.lc20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Code {
    // 基础逻辑
//    public boolean isValid(String s) {
//        String[] arr = s.split("");
//        Stack stack = new Stack<String>();
//        for (int i = 0; i < arr.length; i++) {
//            if (!stack.empty() && ((arr[i].equals(")")) || (arr[i].equals("]")) || (arr[i].equals("}")))) {
//                String str = (String) stack.pop();
//
//                if (str.equals("(") && arr[i].equals(")")) {
//                } else if (str.equals("[") && arr[i].equals("]")) {
//                } else if (str.equals("{") && arr[i].equals("}")) {
//                } else {
//                    return false;
//                }
//                continue;
//            }
//            stack.push(arr[i]);
//        }
//        return stack.empty();
//    }
    // 优化后
    public boolean isValid(String s) {
        String[] arr = s.split("");
        if (arr.length % 2 == 1) {
            return false;
        }
        Map<String, String> map = new HashMap<>() {{
            put("}", "{");
            put("]", "[");
            put(")", "(");
        }};
        Stack stack = new Stack();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                if (stack.empty() || !stack.peek().equals(map.get(arr[i]))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        return stack.empty();
    }
}
