package algorithm.code.java.p01.lc66;

// LC 20: 加一
public class Code {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
           if (digits[i] != 9){
               digits[i] += 1;
               for (int j = i + 1;j < digits.length; j ++){
                   digits[j] = 0;
               }
               return digits;
           }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
