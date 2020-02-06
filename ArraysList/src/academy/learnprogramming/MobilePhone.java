package academy.learnprogramming;

import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;

public class MobilePhone {
    private String owner;
    private String model;
    private ArrayList<Contact> listOfContacts;

    //constructor
    public MobilePhone(String owner, String model) {
        this.owner = owner;
        this.model = model;
        this.listOfContacts = new ArrayList<Contact>();
    }

    //methods
    public void modifyContact (Contact myContact, Contact myNewContact ) {
        if (findContact(myContact) >= 0) {
            this.listOfContacts.set(findContact(myContact),myNewContact);
            System.out.println(myContact.getName() + " replaced by " + myNewContact.getName());
        } else {
            System.out.println("Contact not found");
        }

    }
    public void removeContact (Contact myContact) {
        if (findContact(myContact.getName()) >= 0) {
            this.listOfContacts.remove(myContact);
            System.out.println(myContact.getName() + " removed");
        } else {
            System.out.println("Contact not found");
        }
    }
    public void addContact (Contact myContact) {
        if (findContact(myContact.getName()) < 0) {
            this.listOfContacts.add(myContact);
            System.out.println(myContact.getName() + " added");
        } else {
            System.out.println("Contact already added");
        }
    }
    public int findContact (Contact myContact) {
        return this.listOfContacts.indexOf(myContact);
    }
    public int findContact (String name) {
        for (int i = 0; i < this.listOfContacts.size(); i++) {
            Contact contact = this.listOfContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public String queryContact (Contact myContact) {
        if (findContact(myContact) >= 0) {
            return myContact.getName();
        }
        return null;
    }
    public void printContact () {
        for (int i = 0; i < this.listOfContacts.size(); i++) {
            System.out.println("Contact " + (i+1) + " : " + this.listOfContacts.get(i).getName() + " " + myListOfContacts.get(i).getPhoneNumber());
        }
    }

    //getters
    public String getOwner() {
        return owner;
    }
    public String getModel() {
        return model;
    }
    public ArrayList<Contact> getListOfContacts() {
        return listOfContacts;
    }
    //setters
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setListOfContacts(ArrayList<Contact> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }

}
