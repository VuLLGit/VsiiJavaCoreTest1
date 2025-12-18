package org.example.data;

import java.util.ArrayList;

/**
 * Cung cấp dữ liệu email giả lập cho mục đích thử nghiệm và trình diễn cục bộ.
 */
public class emailData {
    /**
     * Cung cấp dữ liệu email giả lập để kiểm thử logic che giấu email.
     * Danh sách trả về cố ý chứa:
     *
     * Chuỗi ký tự không có '@'
     * Chuỗi ký tự hợp lệ giống email
     * Các đầu vào không hợp lệ và trường hợp ngoại lệ như "@", "@@@gmail.com"
     *
     * @return danh sách bất biến các chuỗi email giả lập, không bao giờ null
     */
    public static ArrayList<String> getEmails() {
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
        list.add("@");

        return list;
    }

    private emailData() {
    }
}
