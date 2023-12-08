package algorithm.code.java.p01;

public class LC283 {
    public static void main(String[] args) {
        Util283 util283 = new Util283();
        int[] arr01 = new int[]{0, 1, 0, 3, 12};
        util283.moveZero(arr01);

    }
}

class Util283 {
    public void moveZero(int[] arr) {
        int pointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                continue;
            arr[pointer++] = arr[i];
        }

        while (pointer < arr.length){
            arr[pointer ++] = 0;
        }
    }
}
