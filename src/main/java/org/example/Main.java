package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> firstNames = new ArrayList<String>();
        ArrayList<String> lastNames = new ArrayList<String>();

        String fullName;
        String firstName;
        String lastName;


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a first and last name for person " + (i + 1) + "\t");
            fullName = sc.nextLine();

            int space = fullName.indexOf(" ");

            firstName = fullName.substring(0,space);
            lastName = fullName.substring(space + 1);

            firstNames.add(firstName);
            lastNames.add(lastName);
        }

        for (int fi = 0; fi < firstNames.size(); fi++) {
            for (int li = 0; li < lastNames.size(); li++) {
                System.out.println(firstNames.get(fi) + " " + lastNames.get(li));
            }
        }
    }
}
