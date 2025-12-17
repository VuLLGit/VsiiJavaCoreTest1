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

        System.out.println(filter(list));
    }

    private static ArrayList<String> filter(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for(String s : list) {
            // kiểm tra string có @ không
            if(s.contains("@")) {
                int lastAt = s.lastIndexOf("@");
                // Phần trước @ cuối, loại bỏ mọi ký tự @ phía trước
                String beforeAt = s.substring(0, lastAt).replace("@", "");
                result.add(beforeAt + "@...");
            }
        }
        return result;
    }
}