package common;

import java.util.Calendar;
import java.util.Random;

/**
 * @author 21051487 sunchengyu
 * @version 1.0
 * @date 2022/1/29
 * @description 数组生成器
 */
public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generateOrderedArray(int n) {
        Integer[] arrs = new Integer[n];
        for (int i = 0; i < n; i++) {
            arrs[i] = i;
        }
        return arrs;
    }

    public static Integer[] generateUnorderedArray(int n, int bound) {
        Random random = new Random(Calendar.getInstance().getTimeInMillis());
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(bound);
        }
        return arr;
    }
}
