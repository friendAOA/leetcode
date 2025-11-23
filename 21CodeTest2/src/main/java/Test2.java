import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: 昊辰（汪程昊）
 * @Date : 2021/11/6
 * @Description :
 * @Modified By : Copyright(c) cai-inc.com
 */
public class Test2 {

    public static void main(String[] args) {
        resolve2();
    }

    public static void resolve1() {
        int[] nums = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter intager:");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                nums[num - 1]++;
            }
        }
        for (int i = 0; i < 100; i++) {
            if (nums[i] != 0) {
                if (nums[i] == 1) {
                    System.out.println((i + 1) + " occurs " + 1 + " time");
                } else {
                    System.out.println((i + 1) + " occurs " + nums[i] + " time");
                }
            }
        }
    }

    public static void resolve2() {
        int[] nums = new int[0];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter intager:");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            nums = Arrays.copyOf(nums, nums.length + 1);
            nums[nums.length - 1] = num;
        }
        InsertSort(nums);
        for (int i = 0; i < nums.length; ) {
            int count = 1;
            for (int j = i + 1; j < nums.length && nums[j] == nums[i]; j++) {
                count++;
            }
            if (count == 1) {
                System.out.println(nums[i] + " occurs " + 1 + " time");
            } else {
                System.out.println(nums[i] + " occurs " + count + " times");
            }
            i = i + count;
        }
    }

    public static int[] InsertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            int e = arr[i];
            for (j = i; j > 0 && arr[j - 1] > e; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = e;
        }
        return arr;
    }


}
