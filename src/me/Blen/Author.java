package me.Blen;

import java.util.ArrayList;

public class Author {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNum;

    public ArrayList<Books> getBooksWrote() {
        return booksWrote;
    }

    public void setBooksWrote(ArrayList<Books> booksWrote) {
        this.booksWrote = booksWrote;
    }

    ArrayList<Books> booksWrote = new ArrayList<>();


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getFullNameAuthor(){
        return getFirstName() + " " + getLastName();
    }
}

