package 哈希.三树之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        //排序，有利于剪枝
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && (nums[i] == nums[i - 1])) {
                continue;
            }
            //双指针
            int left = i + 1;
            int right = nums.length - 1;

            while (right > left) {

                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                }
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
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
        return result;
    }
}