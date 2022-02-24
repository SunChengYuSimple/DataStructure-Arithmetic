package question;

import java.util.Arrays;

/**
 * LeetCode 283.移动数组
 *
 * @author Oliver
 * @description 给定一个数组 nums，写一个函数，将数组中所有的 0 挪到数组末尾，而维持其他所有非 0 元素的相对位置
 * nums=[0,1,0,3,12] 函数运行后结果为 [1,3,12,0,0]
 */
public class MoveZeros {
    public static void main(String[] args) {
        Integer[] nums = {0, 1, 0, 3, 12};
        move3(nums);
        System.out.println(Arrays.toString(nums));
    }
    
    /**
     * 执行用时： 5 ms, 在所有 Java 提交中击败了 12.18% 的用户
     * 内存消耗： 42.8 MB, 在所有 Java 提交中击败了 11.45% 的用户
     *
     * @param nums
     */
    public static void move1(Integer[] nums) {
        Integer[] newNums = new Integer[nums.length];
        Integer zeroNum = 0;
        Integer numIndex = 0;
        for (Integer num : nums) {
            if (num == 0) {
                ++zeroNum;
            } else {
                newNums[numIndex] = num;
                ++numIndex;
            }
        }
        for (Integer i = 0; i < zeroNum; i++) {
            newNums[numIndex + i] = 0;
        }
        for (int i = 0; i < newNums.length; i++) {
            nums[i] = newNums[i];
        }
    }
    
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了25.73%的用户通过测试用例：
     *
     * @param nums
     */
    public static void move2(Integer[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                ++index;
            }
        }
        for (int i = 0; i < nums.length - index; i++) {
            nums[index + i] = 0;
        }
    }
    
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：42.3 MB, 在所有 Java 提交中击败了25.73%的用户通过测试用例：
     *
     * @param nums
     */
    public static void move3(Integer[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (index != i) {
                    int temp = nums[i];
                    nums[i] = nums[index];
                    nums[index] = temp;
                    ++index;
                } else {
                    ++index;
                }
            }
        }
    }
}
