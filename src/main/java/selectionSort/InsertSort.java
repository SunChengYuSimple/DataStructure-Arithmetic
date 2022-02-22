package selectionSort;

import common.ArrayGenerator;

import java.util.Arrays;

/**
 * @author 21051487 sunchengyu
 * @version 1.0
 * @date 2022/1/29
 * @description 插入排序算法
 */
public class InsertSort {

    private InsertSort() {
    }

    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateUnorderedArray(30, 100);
        System.out.println("排序前：" + Arrays.toString(arr));
        converseSort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }

    public static <T extends Comparable<T>> void converseSort(T arr[]) {
        int arrayLength = arr.length;
        for (int i = arrayLength; i >= 0; i--) {
            for (int j = i; j < arrayLength - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort(T arr[]) {
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
