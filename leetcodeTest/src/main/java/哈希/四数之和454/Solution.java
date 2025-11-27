package 哈希.四数之和454;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        //排序，有利于剪枝
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            }
            for (int j = i+1; j < nums.length-1; j++) {

                if (j > i+1 && (nums[j] == nums[j - 1])) {continue;}

                //双指针
                int left = j + 1;
                int right = nums.length - 1;

                while (right > left) {

                    long sum =(long)nums[i]+ nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                    }
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }



        return result;
    }
}