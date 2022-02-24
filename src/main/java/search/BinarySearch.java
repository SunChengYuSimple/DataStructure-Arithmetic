package search;

import common.ArrayGenerator;

import java.util.Arrays;

/**
 * 二分查找
 *
 * @author 21051487 sunchengyu
 * @version 1.0
 * @date 2022/2/24
 * @description
 */
public class BinarySearch {
    public static <T extends Comparable<T>> Integer search(T[] arr, int n, T target) {
        // 在 [l...r] 的范围里寻找 target
        int l = 0, r = n - 1;
        // 当 l == r 时，区间 [l...r] 是有效区间 [16,16]
        while (l <= r) {
            int mid = (l + r) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(arr[mid].compareTo(target)<0){
                // target 在  [l...mid - 1] 中
                r = mid-1;
            }else{
                // target 在  [mid + 1...r] 中
                l=mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateOrderedArray(30);
        System.out.println(Arrays.toString(arr));
        System.out.println(search(arr, arr.length, 14));
    }
}
