package algorithm.code.java.p02.lc22;

import java.util.ArrayList;
import java.util.List;

public class Code {
    private List ans = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        abs("", n, n);
        return ans;
    }

    /**
     * tips: 当 左侧括号 的剩余数量 超过 右侧括号 的剩余数量 => 即: 右括号使用量 > 左括号使用量, 条件则不成立
     *
     * @param str   String 最终需要放入 ans 的字符串
     * @param left  int 左括号的剩余量, 当剩余量为 0 时, 表示已经用尽
     * @param right int 有括号的剩余量, 同上...
     */
    public void abs(String str, int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(str);
        }
        if (right < left) {
            // 右括号的使用数量超过了左括号, 明显不符合
            return;
        }
        if (left > 0) {
            // 回溯
//            str += "(";
//            abs(str,left-1,right);
//            str = str.substring(0, str.length() -1);


            abs(str + "(", left - 1, right);
        }
        if (right > 0) {
            // 回溯
//            str += ")";
//            abs(str,left,right-1);
//            str = str.substring(0, str.length() -1);

            abs(str + ")", left, right - 1);
        }


    }
}
