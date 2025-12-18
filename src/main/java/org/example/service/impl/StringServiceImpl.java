package org.example.service.impl;

import org.example.service.StringService;

import java.util.ArrayList;

public class StringServiceImpl implements StringService {
    private static final String THREE_DOTS = "...";
    private static final String AT = "@";
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final String EMPTY_STRING = "";

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
    @Override
    public ArrayList<String> filterEmail(ArrayList<String> list) {
        if (list == null) {
            return null;
        }

        ArrayList<String> result = new ArrayList<>();
        int lastAt;
        String tempString;

        for (String s : list) {
            if (s.contains(AT)) {
                lastAt = s.lastIndexOf(AT);
                tempString = s.substring(ZERO, lastAt).replace(AT, EMPTY_STRING);
                if (lastAt == s.length() - ONE) {
                    result.add(tempString + AT);
                } else {
                    result.add(tempString + AT + THREE_DOTS);
                }
            }
        }
        return result;
    }
}
