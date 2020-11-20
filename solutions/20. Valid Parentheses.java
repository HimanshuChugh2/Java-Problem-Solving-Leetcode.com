class Solution {
    public boolean isValid(String str) {
        
    
          HashMap<Character,Character> map=new HashMap<>();
          Stack stack=new Stack();
​
​
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
​
        for (int i=0;i<str.length();i++) {
            if (map.containsValue(str.charAt(i))) {
                stack.push(str.charAt(i));
                System.out.println("value added to stack is: " + str.charAt(i));
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    char ab = map.get(str.charAt(i));
                    Object abc = stack.pop();
                    if (abc == map.get(str.charAt(i))) {
                        System.out.println("equal");
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        else    return false;}
}
