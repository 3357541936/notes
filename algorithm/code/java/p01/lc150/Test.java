package algorithm.code.java.p01.lc150;

public class Test {
    public static void main(String[] args) {
        Code code = new Code();
        String[] arr = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(code.evalRPN(arr));
    }
}
