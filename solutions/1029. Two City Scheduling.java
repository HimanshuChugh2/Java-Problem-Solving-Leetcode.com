class Solution {
   public    int twoCitySchedCost(int[][] costs) {
​
        Arrays.sort(costs , (a,b) ->Math.abs(b[0]-b[1]) - Math.abs(a[0]-a[1]));
        int result=0;
        int halflength=costs.length/2;
        int length=costs.length;
        int right=0;
        int left=0;
        for(int i=0;i<costs.length;i++)
        {
            int min=Integer.MAX_VALUE;
​
            for(int j=0;j<costs[j].length-1;j++)
            {
                if(costs[i][j]<costs[i][j+1] || right==halflength)
                {
                    if(left!=halflength )
                    {
                        min = costs[i][j];
                        left++;
                    }
​
                    else
                    {
                        min = costs[i][j+1];
                        right++;
                    }
​
                }
                else
                {
                    if(right!=halflength || left==halflength)
                    {
                        min=costs[i][j+1];
                        right++;
                    }
