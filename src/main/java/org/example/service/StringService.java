package org.example.service;

import java.util.ArrayList;

/**
 * Lớp cung cấp chức năng xử lý chuỗi liên quan đến ký tự '@'.
 */
public interface StringService {

    /**
     * Xử lý từng chuỗi trong danh sách đầu vào có chứa ký tự '@'.
     * Phương thức sẽ loại bỏ các ký tự '@' dư thừa phía trước,
     * giữ lại vị trí '@' cuối cùng và thêm '@' hoặc '@...'
     * tùy theo việc sau '@' cuối cùng còn ký tự hay không.
     *
     * Params:
     * list – Danh sách chuỗi cần xử lý
     *
     * Returns:
     * Danh sách chuỗi sau khi xử lý; trả về null nếu danh sách đầu vào là null
     */
    ArrayList<String> filterEmail(ArrayList<String> List);
}
