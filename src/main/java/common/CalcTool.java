package common;

/**
 * @author Oliver
 * @description 计算工具类
 */
public class CalcTool {
    
    public static<T extends Comparable<T>> void swap(T[] arr,int sourceIndex, int aimIndex) {
        T temp = arr[sourceIndex];
        arr[sourceIndex] = arr[aimIndex];
        arr[aimIndex] = temp;
    }
    
}
