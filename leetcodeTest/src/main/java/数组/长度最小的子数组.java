package 数组;

class 长度最小的子数组 {
    public int minSubArrayLen(int target, int[] nums) {
        int result=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int sum=0;
        for(;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                if(result>(j-i+1)){
                    result=j-i+1;
                }
            
                sum-=nums[i++];
            }
            
        }
        return result==Integer.MAX_VALUE?0:result;
    }
   
}