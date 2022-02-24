package search;

import search.domain.Student;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 21051487 sunchengyu
 * @version 1.0
 * @date 2022/1/29
 * @description 线性查找
 */
public class LinearSearch {

    private LinearSearch() {
    }

    public static void main(String[] args) {
        int arrayLength = 30;
        Random random = new Random();
        Integer[] ints = new Integer[arrayLength];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt() % 100;

        }
        System.out.println(Arrays.toString(ints));
        Integer index = LinearSearch.search(ints, 63);
        System.out.println(index);


        Student[] students = {new Student("Oliver"),
                new Student("Tom"),
                new Student("Jerry")};
        int searchStudent = LinearSearch.search(students, new Student("Oliver"));
        System.out.println("student name search is : " + searchStudent);

    }

    /**
     * 线性查找
     *
     * @param ints 需要遍历的数据
     * @param aimNumber 查询目标元素的值
     * @return 查询到的元素下标
     */
    public static <T> int search(T[] ints, T aimNumber) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i].equals(aimNumber)) {
                return i;
            }
        }
        return -1;
    }
}
