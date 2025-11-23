package 数组;

class 有序数组的平方 {
    public int[] sortedSquares(int[] nums) {
        int[] result=new int[nums.length];
        int last=nums.length-1;
        int end=nums.length-1;
        int start=0;
        while(start<=end){
            if(nums[end]*nums[end] >nums[start]*nums[start]){
                result[last--]=nums[end]*nums[end];
                end--;
            }
            if(nums[end]*nums[end] <nums[start]*nums[start]){
                result[last--]=nums[start]*nums[start];
                start++;
            }
            if(nums[end]*nums[end] ==nums[start]*nums[start]){
                result[last--]=nums[start]*nums[start];
                start++;
            }

        }
        return result;
    }
}