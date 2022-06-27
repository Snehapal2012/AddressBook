package com.addressbook;

public class CreateContacts {
    public static void main(String[] args) {
        Contacts contacts=new Contacts();
        contacts.setFirstName("Sneha");
        System.out.println("First name: "+contacts.getFirstName());
        contacts.setLastName("Pal");
        System.out.println("Last name: "+contacts.getLastName());
        contacts.setAddress("Belghoria");
        System.out.println("Address: "+contacts.getAddress());
        contacts.setCity("Kolkata");
        System.out.println("City: "+contacts.getCity());
        contacts.setState("West Bengal");
        System.out.println("State: "+contacts.getState());
        contacts.setZip("700056");
        System.out.println("Zip: "+contacts.getZip());
        contacts.setPhoneNumber("9674783976");
        System.out.println("Phone Number: "+contacts.getPhoneNumber());
        contacts.setEmail("snehapal2012@gmail.com");
        System.out.println("Email Address: "+contacts.getEmail());
    }
}
