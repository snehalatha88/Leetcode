class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low=1;
       int high=maximum(piles);
       while(low<=high){
        int mid=(low+high)/2;
        int total=calculateTime(piles,mid);
        if(total<=h){
           high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return low;
    }
    static int maximum(int[] piles){
        int maxi=0;
        for(int i=0;i<piles.length;i++){
             maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    static int calculateTime(int[] piles,int hourly){
        int total=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            total+=Math.ceil((double)(piles[i])/(double)(hourly));
        }
        return total;
    }
            
}