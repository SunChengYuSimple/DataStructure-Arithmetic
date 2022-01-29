package selectionSort;

import common.ArrayGenerator;

import java.util.Arrays;

/**
 * @author 21051487 sunchengyu
 * @version 1.0
 * @date 2022/1/29
 * @description 选择排序算法
 */
public class SelectionSort {

    private SelectionSort() {
    }

    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateUnorderedArray(30, 100);
        System.out.println("排序前：" + Arrays.toString(arr));
        sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    public static <T extends Comparable<T>> void sort(T arr[]) {
        int arrayLength = arr.length;
        for (int i = 0, minIndex; i < arrayLength; i++) {
            minIndex = i;
            for (int j = i; j < arrayLength; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            T temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
