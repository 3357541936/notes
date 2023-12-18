package algorithm.code.java.p02.lc874;

import java.util.HashSet;
import java.util.Set;

// lc-874: 模拟行走机器人
// https://leetcode.cn/problems/walking-robot-simulation/
public class Code {
    private int[][] way = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private Set obstacles = new HashSet();


    public int robotSim(int[] commands, int[][] obstacles) {
        // 记录全部障碍物的坐标信息, 使用哈希计算出唯一值
        for (int l = 0; l < obstacles.length; l++) {
            this.obstacles.add(this.hash(obstacles[l][0], obstacles[l][1]));
        }

        int wayIndex = 0;
        int x = 0;
        int y = 0;
        int ans = 0;

        for (int i = 0; i < commands.length; i++) {
            // 根据传入指引, 调整移动方向
            if (commands[i] == -1) {
                wayIndex = (wayIndex + 1) % 4;
            } else if (commands[i] == -2) {
                wayIndex = (wayIndex + 3) % 4;

            } else {
                // 开始进行移动
                while (commands[i]-- > 0) {
                    // 每次移动一个距离
                    int dx = x + this.way[wayIndex][0];
                    int dy = y + this.way[wayIndex][1];
                    // 判断移动后的距离是否是障碍物
                    if (this.obstacles.contains(this.hash(dx, dy))) {
                        break;
                    }
                    // 记录移动距离
                    x = dx;
                    y = dy;
                    // 比对最远移动距离, 保留距离远点最远的答案
                    ans = Math.max(ans, x * x + y * y);
                }
            }

        }
        return ans;
    }

    private int hash(int x, int y) {
        // 根据题目: 障碍物坐标生成范围在 0 - 10^4 之间, 所以混淆参数需要超过 10^4, 否则会重复
        return x * 100001 + y;
    }
}
