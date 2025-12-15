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

        ArrayList<String> result = filter(list);

        System.out.println(result);
    }

    //phương thức filter xóa toàn bộ ký tự sau @
    private static ArrayList<String> filter(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for(String s : list) {
            if(s.contains("@")) {
                String newString = s.substring(0, s.indexOf("@")+1) + "...";
                result.add(newString);
            }
        }
        return result;
    }
}