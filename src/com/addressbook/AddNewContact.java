package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewContact {
    public static void main(String args[]) {
        ArrayList<String> contactDetails = new ArrayList<String>();
        AddNewContact person1 = new AddNewContact();
        System.out.println("Welcome to Address book!");
        person1.addDetails(contactDetails);
        person1.display(contactDetails);
    }
    public static void addDetails(ArrayList ar){
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        ar.add(sc.nextLine());

        System.out.print("Last name: ");
        ar.add(sc.nextLine());

        System.out.print("Address: ");
        ar.add(sc.nextLine());

        System.out.print("City: ");
        ar.add(sc.nextLine());

        System.out.print("State: ");
        ar.add(sc.nextLine());

        System.out.print("Zip: ");
        ar.add(sc.nextLine());

        System.out.print("Phone number: ");
        ar.add(sc.nextLine());

        System.out.print("Email: ");
        ar.add(sc.nextLine());

    }
    static void display(ArrayList a){

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
