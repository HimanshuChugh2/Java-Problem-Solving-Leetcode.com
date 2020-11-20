class Solution {
    
     public static void main(String[] args) {
       
          Scanner sc=new Scanner(System.in);
          int number=sc.nextInt();
          reverse(number);
    }
   public static int reverse(int temp) {
​
       int x=0;
        int newX=0;
        System.out.println(Integer.MAX_VALUE);
        if(temp>=Integer.MAX_VALUE || temp<=Integer.MIN_VALUE)
        {
            return  0;
        }
​
        else {
            if (temp < 0) {
                temp = Math.abs(temp);
​
                while (temp > 0) {
                    if (newX>Integer.MAX_VALUE/10 || newX==Integer.MAX_VALUE/10 && (temp % 10)>7 )
                        return 0;
                    if (newX<Integer.MIN_VALUE/10 || newX==Integer.MIN_VALUE/10 && (temp % 10)<-8 )
                        return 0;
​
                    newX = (newX * 10) + (temp % 10);
                     temp /= 10;
                }
                return -newX;
            } else {
                while (temp > 0) {
                    if (newX>Integer.MAX_VALUE/10 || newX==Integer.MAX_VALUE/10 && (temp % 10)>7 )
                        return 0;
                    if (newX<Integer.MIN_VALUE/10 || newX==Integer.MIN_VALUE/10 && (temp % 10)<-8 )
                        return 0;
                    newX = (newX * 10) + (temp % 10);
                    temp /= 10;
                }
            }
        }
        return newX;
       }
 
}
