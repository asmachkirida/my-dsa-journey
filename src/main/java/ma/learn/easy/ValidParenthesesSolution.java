package ma.learn.easy;

import java.util.Stack;

public class ValidParenthesesSolution {
    public boolean isValid(String s) {

        if(s.length() % 2!=0) return false;
        Stack<Character> mystack = new Stack<Character>();
        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)== '(' || s.charAt(i)== '{' || s.charAt(i)== '[')
                mystack.push(s.charAt(i));
            else {
                if(mystack.empty()) return false;}

            if(s.charAt(i)==')') {
                if(mystack.peek()!='(') return false;
                else mystack.pop();
            }
            else   if(s.charAt(i)==']') {
                if(mystack.peek()!='[') return false;
                else mystack.pop();
            }
            else   if(s.charAt(i)=='}') {
                if(mystack.peek()!='{') return false;
                else mystack.pop();
            }
        }
        if(mystack.empty()) return true;
        else return false;
    }
}
