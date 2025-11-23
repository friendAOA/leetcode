# 704.二分查找
题目建议： 大家今天能把 704.二分查找 彻底掌握就可以，至于 35.搜索插入位置 和 34. 在排序数组中查找元素的第一个和最后一个位置 ，如果有时间就去看一下，没时间可以先不看，二刷的时候在看。

先把 704写熟练，要熟悉 根据 左闭右开，左闭右闭 两种区间规则 写出来的二分法。

## 题解
二分法：取用middle=（开始值+终值）/2,进行比较

+ input<middle 或 input>middle,跳转区间

```java
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
```

# 27.移除元素
题目建议：  暴力的解法，可以锻炼一下我们的代码实现能力，建议先把暴力写法写一遍。 双指针法 是本题的精髓，今日需要掌握，至于拓展题目可以先不看。 



## 题解
双指针法：快指针遍历数组，慢指针重新赋值

```java
class 移除元素 {
    public int removeElement(int[] nums, int val) {
        int slowIndex=0;
        for(int fastIndex=0;fastIndex<nums.length;fastIndex++){
            if(nums[fastIndex]!=val){
                nums[slowIndex]=nums[fastIndex];
                slowIndex++;
            }

        }
        return slowIndex;
    }
}
```



# [<font style="background-color:rgb(240, 240, 240);">977. 有序数组的平方</font>](https://leetcode.cn/problems/squares-of-a-sorted-array/)
<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">给你一个按</font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">非递减顺序</font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">排序的整数数组</font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">nums</font>`<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">，返回</font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">每个数字的平方</font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">组成的新数组，要求也按</font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">非递减顺序</font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">排序。</font>

<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"></font>

## <font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">题解</font>
从后往前输入

```java
class Solution {
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
```

# 008 长度最小的子数组
<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">给定一个含有 </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">n</font>`**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">个正整数的数组和一个正整数</font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">target</font>`**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>****<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">。</font>**

<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">找出该数组中满足其和</font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>**`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">≥ target</font>`**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">的长度最小的 </font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">连续子数组</font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">[nums</font><sub><font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">l</font></sub><font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">, nums</font><sub><font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">l+1</font></sub><font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">, ..., nums</font><sub><font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">r-1</font></sub><font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">, nums</font><sub><font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">r</font></sub><font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">]</font>`<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> ，并返回其长度</font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">。</font>**<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">如果不存在符合条件的子数组，返回 </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">0</font>`<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> 。</font>

<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"></font>

## <font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">题解</font>


<font style="color:rgb(44, 62, 80);">所谓滑动窗口，</font>**<font style="color:rgb(44, 62, 80);">就是不断的调节子序列的起始位置和终止位置，从而得出我们想要的结果</font>**<font style="color:rgb(44, 62, 80);">。</font>

```java
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
```

# 59 [螺旋矩阵 II](https://leetcode.cn/problems/spiral-matrix-ii/)
<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">给你一个正整数 </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">n</font>`<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">，生成一个包含</font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">1</font>`<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">到 </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">n</font><sup><font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">2</font></sup>`<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> 所有元素，且元素按顺时针顺序螺旋排列的 </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">n x n</font>`<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">正方形矩阵</font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font>`<font style="color:rgba(38, 38, 38, 0.75);background-color:rgba(0, 10, 32, 0.03);">matrix</font>`<font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);"> </font><font style="color:rgb(38, 38, 38);background-color:rgb(240, 240, 240);">。</font>

## 题解


```java
class Solution {
    public int[][] generateMatrix(int n) {
        int startX=0,startY=0;//记录每一圈的起始点

        int i=0;
        int j=0;
        int[][] result=new int[n][n];
        int offset=1;
        int road=1;//记录圈数
        int num=1;//记录赋值
        while(road<=n/2){ 
            
            for(j=startX;j<n-offset;j++){
                result[startX][j]=num++;
            }
            for(i=startY;i<n-offset;i++){
               result[i][j]=num++;
            }
            for(;j>startX;j--){
               result[i][j]=num++;
            }
            for(;i>startY;i--){
               result[i][j]=num++;
            }
            startX++;
            startY++;
            road++;
            offset++;

        }
        if(n%2==1){
                result[startX][startY]=n*n;
        }
        return result;
    }
}
```

