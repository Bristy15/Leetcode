class Solution {
    public int fib(int n) {
        int f1=0;
        int f2=1;
        int temp=0;
        int ans=0;
        if (n==0) 
        {
            //System.out.print(f1);
            ans=f1;
            //return f1;
        }
        else if(n>1)
        {
        
            for (int i=2;i<=n;i++)
            {
                temp=f1+f2;
                if (i==n) 
                {
                   // System.out.print(temp);
                    ans=temp;
              //      return temp;
                }
                f1=f2;
                f2=temp;
            }
        }
        else 
        {
            //System.out.print(f2);
            ans=f2;
            //return f2;

        } 
        return ans;
    }
}
