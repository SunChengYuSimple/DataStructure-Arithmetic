package search.domain;

import java.util.Locale;
import java.util.Objects;

/**
 * @author 21051487 sunchengyu
 * @version 1.0
 * @date 2022/1/29
 * @description 学生类
 */
public class Student {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object stu) {
        if (this == stu) {
            return true;
        }
        if (stu == null || getClass() != stu.getClass()) {
            return false;
        }
        Student student = (Student) stu;
        return this.name.toLowerCase(Locale.ROOT).equals(student.name.toLowerCase(Locale.ROOT));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
