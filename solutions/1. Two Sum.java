class Solution {
 
   
    static int[] toReturn=new int[2];
​
    
​
    public static int[] twoSum(int[] arr,int target)
    {
        for (int j=0;j<arr.length;j++) {
            for (int i = 0; i < arr.length; i++) {
                if (i == j) {
                } else {
                    if (arr[j] + arr[i] == target) {
                        toReturn[0] = j;
                        toReturn[1] = i;
                        return toReturn;
                    }
                }
            }
        }
        return null;
    }
}
