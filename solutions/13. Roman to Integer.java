class Solution {
    public int romanToInt(String s) {
​
           Map<Character, Integer> Mapp = new HashMap<Character, Integer>();
        Mapp.put('I', 1);
        Mapp.put('V', 5);
        Mapp.put('X', 10);
        Mapp.put('L', 50);
        Mapp.put('C', 100);
        Mapp.put('D', 500);
        Mapp.put('M', 1000);
​
​
        int sum = 0;
        int prev = 0;
        int thisOne = 0;
        for (int i = 0; i < s.length(); i++) {
            thisOne = Mapp.get(s.charAt(i));
​
            if (thisOne>prev && prev!=0)
            {
                thisOne = thisOne-(prev*2);
                sum+=thisOne;
            }
            else
            {
                sum+=thisOne;
                prev=thisOne;
            }
​
​
        }
        return sum;
    }
}
