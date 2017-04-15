import java.util.Stack;

/**
 * Created by hyh on 2017/4/15.
 */
public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {
        if(tokens == null || tokens.length <=0)
            return 0;
        String operators = "+-*/";
        Stack<String> stack = new Stack<>();
        for(int i=0; i< tokens.length; i++){
            String temp = tokens[i];
            if(operators.indexOf(temp)!=-1){
                if(stack.size()<2)
                    return 0;
                else{
                    int b = Integer.valueOf(stack.pop());
                    int a = Integer.valueOf(stack.pop());
                    switch(temp){
                       case  "+": stack.push(String.valueOf(a+b));break;
                       case "-": stack.push(String.valueOf(a-b));break;
                       case  "*": stack.push(String.valueOf(a*b));break;
                       case "/": stack.push(String.valueOf(a/b));break;
                    default: ;
                	}
                }

            }
            else
                stack.push(temp);
        }
        return Integer.valueOf(stack.pop());
    }
    public  static void main(String[] args){
        String[] s = {"4","3","-"};
        int result = evalRPN(s);
        System.out.print(result);
    }
}
