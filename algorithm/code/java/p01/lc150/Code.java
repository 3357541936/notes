package algorithm.code.java.p01.lc150;

import java.util.Stack;

// 逆波兰表达式求值(Evaluate Reverse Polish Notation)
public class Code {
    public int evalRPN(String[] tokens) {
        Stack stack = new Stack();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int rightValue = (int) stack.pop();
                int leftValue = (int) stack.pop();
                int result = 0;
                switch (tokens[i]){
                    case "+": result = leftValue + rightValue; break;
                    case "-": result = leftValue - rightValue; break;
                    case "*": result = leftValue * rightValue; break;
                    case "/": result = leftValue / rightValue; break;
                }
                stack.push(result);
            }else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return (int) stack.pop();
    }
}
