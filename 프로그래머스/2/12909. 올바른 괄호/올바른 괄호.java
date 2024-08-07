import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(Character x : s.toCharArray())
        {
        	if(x == '(')
        	{
        		stack.push(x);
        	}
        	else
        	{
        		if(stack.isEmpty())
        			return false;
        		stack.pop();
        	}
        }
        if(!stack.isEmpty())
        	return false;
        	
        return answer;
    }
}