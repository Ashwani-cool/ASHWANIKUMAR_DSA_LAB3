package balancingbrackets.balancelogic;

import java.util.Stack;

public class StackBalance {
    public boolean checkBalanceBracket(String bracket){
        Stack<Character> stBracket = new Stack<Character>();
        for(int i=0;i<bracket.length();i++){
            char item = bracket.charAt(i);
            if(item=='(' || item=='{' || item=='['){
                stBracket.push(item);

            }
            if(stBracket.empty()) {
                return false;
            }else if(item==')'){
                if(stBracket.peek()=='(') {
                    stBracket.pop();
                }else{
                    return false;
                }
            }

            else if(item=='}')
                if(stBracket.peek()=='{') {
                stBracket.pop();
            }else{
                return false;
            }
            else if (item == ']'){
                if (stBracket.peek() == '[') {
                    stBracket.pop();
                } else {
                    return false;
                }
            }

        }
        return stBracket.empty();
    }
}
