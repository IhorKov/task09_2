package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list.add("vasiliy");
        list.add("vitaliy");
        list.add("andrey");
        list.add("timur");
        list.add("anna");
        list.add("andrey");
        list.add("anna");

        list2.add("vasiliy");
        list2.add("anastasiya");
        list2.add("ivan");
        list2.add("vasiliy");
        list2.add("anna");
        list2.add("ivan");

        Set<String> set = checkValue(list);
        List<String> checkList = checkValueList(list2);

        for (String s : checkList) {
            System.out.println(s);
        }

        for (String s : set) {
            System.out.println(s);
        }
    }

    public static Set<String> checkValue(ArrayList<String> list) {
        Set<String> copySet = new HashSet<>(list);
        return copySet;
    }

    public static List<String> checkValueList(List<String> list) {
        List<String> copy = new ArrayList<>(list);

        for (int i = 0; i < list.size() - 1; i++){
            String s = list.get(i);

            for (int k = i + 1; k < list.size();) {
                if (s == list.get(k)) {
                    list.remove(k);
                    continue;
                }
                k++;
            }
        }
        return list;
    }

}
