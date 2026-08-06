class Solution {
    public boolean isValid(String s) {
char ch = 'a';
        char top = 'a';
        Stack <Character>  stack = new Stack<>();
        boolean isValid= false;
        for(int i = 0 ; i < s.length() ; i++){
            ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    top = stack.peek();
                    if(top=='(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']'){
                        stack.pop();
                    }else{
                        isValid = false;
                        return isValid;
                    }
                }else{
                    stack.push(ch);
                }
            }
        }
        if(stack.isEmpty()){
            isValid = true;
        }
        return isValid;
    }
}