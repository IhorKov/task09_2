package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    ArrayList<String> list = new ArrayList<>();

	    list.add("vasiliy");
	    list.add("vitaliy");
	    list.add("andrey");
	    list.add("timur");
	    list.add("anna");
	    list.add("andrey");
	    list.add("anna");

	    Set<String> set = checkValue(list);

        for (String s: set) {
            System.out.println(s);
        }
    }
    public static Set<String> checkValue(ArrayList<String> list) {
        Set<String> copySet = new HashSet<>(list);
        return copySet;
    }
}
