class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        int n=accounts.length;
        int m=accounts[0].length;
        for(int i=0;i<=n-1;i++){
            int sum=0;
            for(int j=0;j<=m-1;j++){
            sum+=accounts[i][j];
        }
        if(sum>max){
            max=sum;
        }

        }
        return max;  
    }
}