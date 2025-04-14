package org.example;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date d = new Date(0);
        char g = 'a';
        String fullname="gigi";
        String[] ekk={"sss","aa","vv","eee"};

        System.out.println(d);
        System.out.println(g);
        System.out.println(fullname);
        System.out.println(ekk.length);

        for (int i = 0; i < ekk.length; i++) {
            System.out.println(ekk[i]);
        }



    }
}