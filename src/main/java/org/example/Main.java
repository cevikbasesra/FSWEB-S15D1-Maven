package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*Grocery grocery = new Grocery();
        grocery.startGrocery();*/

        MobilePhone mobilePhone = new MobilePhone("1212121212", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("esra","1313"));
        mobilePhone.addNewContact(new Contact("ali","1414"));
        mobilePhone.printContacts();
    }
}
