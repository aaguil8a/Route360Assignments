package com.citalan.contact;



public class ContactApplication {
    public static void main (String args[]){
      
    }

    // private A contacts full name
    public String getFullName(Contact contact){
        return contact.firstName + " " + contact.lastName;
    }

    // print a contact's full name
    public void printContact(Contact contact){
        System.out.println(getFullName(contact));
    }

    



    // Find a Friend by Full Name from a Contact list
    public Contact findFriend(Contact[] contacts, String fullName){
        for (Contact contact : contacts) {
            if (getFullName(contact).equals(fullName)) {
                return contact;
            }
        }
        return null;
    }

    // Add a contact to a contact list
    // methoods arguments are: first name, last name, age, distance, favorite, isFriend
    public Contact[] addContact(Contact[] contacts, String firstName, String lastName, int age, double distance, boolean favorite, boolean isFriend){
        Contact newContact = new Contact();
        newContact.firstName = firstName;
        newContact.lastName = lastName;
        newContact.age = age;
        newContact.distance = distance;
        newContact.favorite = favorite;
        newContact.isFriend = isFriend;
        Contact[] newContacts = new Contact[contacts.length + 1];
        for (int i = 0; i < contacts.length; i++) {
            newContacts[i] = contacts[i];
        }
        newContacts[contacts.length] = newContact;
        return newContacts;
    }





}
