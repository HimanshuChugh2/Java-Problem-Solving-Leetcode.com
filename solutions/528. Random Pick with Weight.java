class Solution {
int[] l1;
int sum=0;
public Solution(int[] w) {
l1=new int[w.length];
for(int i=0;i<l1.length;i++)
{
sum+=w[i];
l1[i]=sum;
}
​
}
​
public int pickIndex() {
    int rand=(int)(Math.random()*sum);
    int left=0,right=l1.length-1, mid;
    while(left<right)
    {
        mid=(left+right)/2;
        if(l1[mid]>rand)
        {
            right=mid;
        } 
        else
        {
            left=mid+1;
        }
    }
    return left;
}
}
