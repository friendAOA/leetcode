package 哈希.两个数组的交集;

import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<nums1.length;i++){
                set.add(nums1[i]);
            }
            HashSet<Integer> set2=new HashSet<>();
            for(int i=0;i<nums2.length;i++){
                if(set.contains(nums2[i])){
                    set2.add(nums2[i]);
                }
            }
            return set2.stream().mapToInt(Integer::intValue).toArray();
    }
}