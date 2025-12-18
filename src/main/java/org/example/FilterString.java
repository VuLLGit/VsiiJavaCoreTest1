package org.example;

import java.util.ArrayList;

public class FilterString {

    // sử dụng để lấy @ cuối cùng và loại bỏ toàn bộ ký tự phía sau nó thành "..."
    public ArrayList<String> process(ArrayList<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("list must not be null");
        }

        ArrayList<String> result = new ArrayList<>();
        int lastAt;
        String tempString;

        for (String s : list) {
            if (s.contains(Constants.AT)) {
                lastAt = s.lastIndexOf(Constants.AT);
                tempString = s.substring(0, lastAt + 1);

                // loại bỏ mọi ký tự @ phía trước trừ phần cuối
                for (int i = 0; i < tempString.length() - 1; i++) {
                    // sau khi substring loại bỏ @ thì phải lùi một index để tránh bỏ qua các @ liền kề nhau
                    if (String.valueOf(tempString.charAt(i)).equals(Constants.AT)) {
                        tempString = tempString.substring(0, i) + tempString.substring(i + 1);
                        i--;
                    }
                }

                // kiểm tra xem sau @ còn ký tự không
                if (lastAt == s.length() - 1) {
                    result.add(tempString);
                } else {
                    result.add(tempString + Constants.AFTER_STRING);
                }
            }
        }
        return result;
    }
}
