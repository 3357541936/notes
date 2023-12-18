package algorithm.code.java.p02.lc874;

public class Test {
    public static void main(String[] args) {
        Code code = new Code();
        int[] control = new int[]{6,-1,-1,6};
        int[][] obs = new int[][]{};
        System.out.println(code.robotSim(control,obs));
    }
}
