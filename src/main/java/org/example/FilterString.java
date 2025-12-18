package org.example;

import java.util.ArrayList;

/**
 * Lớp cung cấp chức năng xử lý chuỗi liên quan đến ký tự '@'.
 */
public class FilterString {

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
    public ArrayList<String> process(ArrayList<String> list) {
        if (list == null) {
            return null;
        }

        ArrayList<String> result = new ArrayList<>();
        int lastAt;
        String tempString;

        for (String s : list) {
            if (s.contains(Constants.AT)) {
                lastAt = s.lastIndexOf(Constants.AT);
                tempString = s.substring(Constants.ZERO, lastAt).replace(Constants.AT, Constants.EMPTY_STRING);
                if (lastAt == s.length() - Constants.ONE) {
                    result.add(tempString + Constants.AT);
                } else {
                    result.add(tempString + Constants.AT + Constants.THREE_DOTS);
                }
            }
        }
        return result;
    }
}
