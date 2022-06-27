package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class EditContact {
    public static void main(String args[]) {
        ArrayList<String> contactDetails = new ArrayList<String>();
        EditContact person1 = new EditContact();
        System.out.println("Welcome to Address book!");
        person1.inputDetails(contactDetails);
        person1.display(contactDetails);
        person1.editDetails(contactDetails);
    }
    public static void inputDetails(ArrayList ar){
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
    public static void display(ArrayList a){

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
    public static void editDetails(ArrayList a){
        String edit,updatedInput;
        int index;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the existing details you want to update: ");
        edit=input.nextLine();
        index= a.indexOf(edit);
        System.out.print("Enter the details you want to update: ");
        updatedInput=input.nextLine();
        a.set(index,updatedInput);
        System.out.println("The New Updated details..........");
        display(a);
    }
}
