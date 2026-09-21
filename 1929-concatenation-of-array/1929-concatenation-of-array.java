class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr =new int[nums.length*2];
        for(int i=0;i<=nums.length-1;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;

        
        
    }
}