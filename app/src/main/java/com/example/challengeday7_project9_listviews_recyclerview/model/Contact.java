package com.example.challengeday7_project9_listviews_recyclerview.model;

public class Contact {

    private int id;
    private String userName;
    private String userContactNumber;

    public Contact() {
    }

    public Contact(String userName, String userContactNumber) {
        this.userName = userName;
        this.userContactNumber = userContactNumber;
    }

    public Contact(int id, String userName, String userContactNumber) {
        this.id = id;
        this.userName = userName;
        this.userContactNumber = userContactNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserContactNumber() {
        return userContactNumber;
    }

    public void setUserContactNumber(String userContactNumber) {
        this.userContactNumber = userContactNumber;
    }

}
