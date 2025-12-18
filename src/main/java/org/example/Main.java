package org.example;

import org.example.service.impl.StringServiceImpl;
import org.example.service.StringService;

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

        StringService stringService = new StringServiceImpl();
        System.out.println(stringService.filterEmail(list));
    }
}


