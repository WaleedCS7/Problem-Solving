import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        
        for(int i = 0;i<s.length();i++){//loop with conditions to stack the brackets if its an open bracket
            if (s.charAt(i) == '(') {
                stack.push('(');
                
            }
             else if (s.charAt(i) == '[') {
                stack.push('[');
                
            }
             else if (s.charAt(i) == '{') {
                stack.push('{');
                
            }else{// if its closed see if its in order if it isn't than false otherwise true...
                if(stack.isEmpty()) return false;
                char before = stack.pop();
                

                if (s.charAt(i) == ')' && before != '(') return false; 

                if (s.charAt(i) == ']' && before != '[') return false;

                if (s.charAt(i) == '}' && before != '{') return false;

                    
                





            }
    
    }
    return stack.isEmpty();//if its empty then the brackets are in order and no bracket is left alone...
}
}



