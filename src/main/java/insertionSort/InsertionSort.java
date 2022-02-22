package insertionSort;

import common.ArrayGenerator;
import common.CalcTool;

import java.util.Arrays;

/**
 * @author 21051487 sunchengyu
 * @version 1.0
 * @date 2022/1/29
 * @description 插入排序算法
 */
public class InsertionSort {
    
    private InsertionSort() {
    }
    
    public static void main(String[] args) {
        Integer[] arr = ArrayGenerator.generateUnorderedArray(30, 100);
        System.out.println("排序前：" + Arrays.toString(arr));
        optimizingSort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
    }
    
    /**
     * 优化后的插入排序算法
     * @param arr
     * @param <T>
     */
    public static <T extends Comparable<T>> void optimizingSort(T arr[]) {
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            T t = arr[i];
            int j;
            for (j = i; j > 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }
    
    /**
     * 从后往前实现插入排序
     * @param arr
     * @param <T>
     */
    public static <T extends Comparable<T>> void converseSort(T arr[]) {
        int arrayLength = arr.length;
        // TODO 待优化
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
                    CalcTool.swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
