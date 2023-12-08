package algorithm.code.java.p01;

public class LC26 {
    public static void main(String[] args) {
        Util26 util26 = new Util26();

        int[] nums01 = new int[]{1,1,2};
        int n1 = util26.removeDuplicates(nums01);
        System.out.println(n1);

        int[] nums02 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int n2 = util26.removeDuplicates(nums02);
        System.out.println(n2);
    }
}

class Util26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int counter = 1;
        int index = 1;
        while (index < nums.length) {
            if (nums[index - 1] != nums[index]) {
                nums[counter++] = nums[index];

            }
            index++;
        }
        return counter;
    }

    public int removeDuplicatesByFor(int[] nums) {
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i])
                nums[counter++] = nums[i];
        }
        return counter;
    }
}