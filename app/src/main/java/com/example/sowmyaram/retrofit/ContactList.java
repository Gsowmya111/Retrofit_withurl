package com.example.sowmyaram.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by sowmyaram on 11/14/2017.
 */

public class ContactList {

    @SerializedName("contacts")
    @Expose
    private ArrayList<Contact> contacts = new ArrayList<>();

    /**
     * @return The contacts
     */
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    /**
     * @param contacts The contacts
     */
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
}