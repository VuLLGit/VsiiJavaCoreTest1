package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaCore");
        list.add("List");
        list.add("ArrayList");
        list.add("tran.the.dung@vsi-international.com");
        list.add("dungtt@gmail.com");
        list.add("d@ung@vsi-international.com");
        list.add("VietSoftw@re@vsi-international.com");
        list.add("@@@gmail.com");

        System.out.println(FilterString.filter(list));
    }
}