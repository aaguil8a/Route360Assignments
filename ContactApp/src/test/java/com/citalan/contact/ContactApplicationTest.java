package com.citalan.contact;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactApplicationTest {

    @Test
    void getFullName() {
        ContactApplication contactApplication = new ContactApplication();
        Contact contact = new Contact();
        contact.firstName = "John";
        contact.lastName = "Doe";
        assertEquals("John Doe", contactApplication.getFullName(contact));
        
    }

    @Test
    void printContact() {
        ContactApplication contactApplication = new ContactApplication();
        Contact contact = new Contact();
        contact.firstName = "John";
        contact.lastName = "Doe";
        contactApplication.printContact(contact);
    }
}