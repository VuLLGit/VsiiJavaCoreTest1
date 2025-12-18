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
     * Triển khai filterEmail(ArrayList<String> List.
     * Việc triển khai này tuân theo quy tắc che giấu '@' cuối cùng.
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
