package org.example;

import java.util.ArrayList;

public class FilterString {
    private static final String AFTERSTRING = "...";

    // sử dụng để lấy @ cuối cùng và loại bỏ toàn bộ ký tự phía sau nó thành "..."
    public ArrayList<String> filter(ArrayList<String> list) {
        // check null
        if (list == null) {
            throw new IllegalArgumentException("list must not be null");
        }
        // khai báo
        ArrayList<String> result = new ArrayList<>();
        int lastAt;
        String beforeAt;

        for (String s : list) {
            if (s.contains("@")) {
                lastAt = s.lastIndexOf("@");
                beforeAt = s.substring(0, lastAt + 1);

                // loại bỏ mọi ký tự @ phía trước trừ phần cuối
                for (int i = 0; i < beforeAt.length() - 1; i++) {
                    // sau khi substring loại bỏ @ thì phải lùi một index để tránh bỏ qua các @ liền kề nhau
                    if (beforeAt.charAt(i) == '@') {
                        beforeAt = beforeAt.substring(0, i) + beforeAt.substring(i + 1);
                        i--;
                    }
                }

                // kiểm tra xem sau @ còn ký tự không
                if (lastAt == s.length() - 1) {
                    result.add(beforeAt);
                } else {
                    result.add(beforeAt + AFTERSTRING);
                }
            }
        }
        return result;
    }

}
