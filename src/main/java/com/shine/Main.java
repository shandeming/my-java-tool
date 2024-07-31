package com.shine;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String[] str1 = input.split("\\s*,\\s*");
        input = scanner.nextLine();
        String[] str2 = input.split("\\s*,\\s*");
        List<String> list1 = Arrays.asList(str1);
        List<String> list2 = Arrays.asList(str2);
        // 计算list1中有但list2中没有的元素
        if (list1.size() > list2.size()) {
            List<String> difference1 = (List<String>) CollectionUtils.subtract(list1, list2);
            System.out.println("Elements in list1 but not in list2: " + difference1);
        } else {
            // 计算list2中有但list1中没有的元素
            List<String> difference2 = (List<String>) CollectionUtils.subtract(list2, list1);
            System.out.println("Elements in list2 but not in list1: " + difference2);
        }
    }
}