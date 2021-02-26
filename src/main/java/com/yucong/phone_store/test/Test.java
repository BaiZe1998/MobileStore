package com.yucong.phone_store.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3,32,321};
        System.out.println(solution.PrintMinNumber(a));
    }
}

class Solution {
    public String PrintMinNumber(int [] numbers) {
        MyString[] strings = new MyString[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            strings[i] = (new MyString(String.valueOf(numbers[i])));
        //该方法可以对任意实现了Comparable接口的数组进行排序
        Arrays.sort(strings);
//        for (int i = 0; i < strings.length; i++)
//            System.out.println(strings[i]);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.length; i++)
            stringBuilder.append(strings[i].getString());
        return stringBuilder.toString();
    }
}

class MyString implements Comparable<MyString>{

    private String string;

    public String getString() {
        return string;
    }

    @Override
    public int compareTo(MyString o) {
        //这里还是调用String默认实现的从小到大排序
        return (this.string + o.string).compareTo(o.string + this.string);
    }

    public MyString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "MyString{" +
                "string='" + string + '\'' +
                '}';
    }
}