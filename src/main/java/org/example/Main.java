package org.example;
import java.util.Arrays;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date d = new Date(0);
        char g = 'a';
        String fullname = "gigi tedi bok";
        String[] ekk = {"sss", "aa", "vv", "eee"};


        System.out.println(d);
        System.out.println(g);
        System.out.println(fullname);
        System.out.println(ekk.length);

        String[] splited = fullname.split(" ");
        System.out.println(Arrays.toString(splited));
        for (String word : splited) {
            System.out.println(word);
        }
//        for (int i = 0; i < ekk.length; i++) {
//            System.out.println(ekk[i]);
//        }


    }
}