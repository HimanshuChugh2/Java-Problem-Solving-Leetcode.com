class Solution {
   public static boolean isHappy(int n) {
​
        List<Integer> list= new ArrayList<>();
        int m,total=0;
        int listSizeMatch = 0;
        while(true)
        {
            m=n%10;
            m=m*m;
            total+=m;
            n/=10;
​
            if (total==1 && n<=0)
            {
           //     System.out.println("its happy number");
                return true;
            }
            if (n<=0)
            {
                n=total;
                total=0;
                if(list.contains(n)) {
                   listSizeMatch++;
               //     System.out.println("listSizeMatch is"+listSizeMatch);
                   if (listSizeMatch==list.size())
                       return false;
                }
                else
                {
                    list.add(n);
                }
​
              //  System.out.println("its not true the number is" + n);
            }
        }
​
