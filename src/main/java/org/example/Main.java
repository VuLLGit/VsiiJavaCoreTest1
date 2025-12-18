package org.example;

import org.example.data.emailData;
import org.example.service.impl.StringServiceImpl;
import org.example.service.StringService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = emailData.getEmails();
        StringService stringService = new StringServiceImpl();
        System.out.println(stringService.filterEmail(list));
    }
}


