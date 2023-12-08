package algorithm.code.java.p01;

import java.util.Arrays;

public class LC88 {
    public static void main(String[] args) {
        Util88 util88 = new Util88();
        int[] arr01 = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr02 = new int[]{2, 5, 6};
        util88.merge(arr01, 3, arr02, 3);

    }
}

class Util88 {
    public void merge(int[] nums01, int m, int[] nums02, int n) {
        // 逆向指针
        int pointer01 = m - 1;
        int pointer02 = n - 1;
        int tail = m + n - 1;

        while (tail >= 0){
            if (pointer01 < 0 || (pointer02 >= 0 && nums01[pointer01] < nums02[pointer02] )){
                nums01[tail --] = nums02[pointer02 --];
            }else {
                nums01[tail --] = nums01[pointer01 --];
            }
        }


        System.out.println(Arrays.toString(nums01));
    }
}
