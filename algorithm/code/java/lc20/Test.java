package algorithm.code.java.lc20;

public class Test {
    public static void main(String[] args) {
        Code code = new Code();
        String str = "()[}{}";
        System.out.println(code.isValid(str));
    }
}
