class Solution {
    int power(int mid,int n,int m) {
        long result=1;
        for(int i=1;i<=n;i++) {
            result*=mid;
            if(result>m) {
                return -1;
            }
        }
        if(result==m) {
            return 0;
        }
        return 1;
    }
    public int nthRoot(int n, int m) {
        // code here
        if(m==0) {
            return 0;
        }
        int low=1;
        int high=m;
        while(low<=high) {
            int mid=low+(high-low)/2;
            int check=power(mid,n,m);
            if(check==0) {
                return mid;
            }
            else if(check==1) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
}