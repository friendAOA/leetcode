package 数组;

/**
 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果 target 存在返回下标，否则返回 -1。

 你必须编写一个具有 O(log n) 时间复杂度的算法。
 */
class 二分查找 {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        while(start<=end){
            int middle=(start+end)/2;
            if(target>nums[middle]){
                start=middle+1;
            }else if (target<nums[middle]){
                end=middle-1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}