package com.huawei.compare;

/**
 * 测试Student类实现Comparable接口
 *
 * @since 2021/1/11
 * @author YOUYAYAYA
 */
@SuppressWarnings("rawtypes")
public class TestStudent {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setUsername("张三");
        student1.setAge(11);

        Student student2 = new Student();
        student2.setUsername("李四");
        student2.setAge(22);

        System.out.println(getMax(student1, student2));
    }

    public static Comparable getMax(Comparable v1, Comparable v2) {
        int result = v1.compareTo(v2);
        if (result >= 0) {
            return v1;
        } else {
            return v2;
        }

    }
}
