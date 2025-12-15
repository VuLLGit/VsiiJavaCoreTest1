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
                int count = 0;
                int firstAtIndex = -1;

                //kiểm tra xem có dấu @ thứ 2 không và lấy ra vị trí @ thứ nhất
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '@') {
                        count++;

                        if (count == 1) {
                            firstAtIndex = i;
                        }

                        if (count == 2) {
                            String beforeSecondAt = s.substring(0, i).replace("@", "");
                            result.add(beforeSecondAt + "@...");
                            break;
                        }
                    }
                }

                // Nếu chỉ có 1 dấu @ thì lấy
                if (count == 1) {
                    result.add(s.substring(0, firstAtIndex) + "@...");
                }
            }
        }
        return result;
    }
}