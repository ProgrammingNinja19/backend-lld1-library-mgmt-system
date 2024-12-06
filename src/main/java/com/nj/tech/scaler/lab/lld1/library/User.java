package com.nj.tech.scaler.lab.lld1.library;

/*
 * Created by Ninad Jingare on  Date: 06-12-2024
 */
public abstract class User {
    
    private String userId;
    private String name;
    private String contactInfo;

    static int totalUsers;


    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public User(){
        this.userId = generateUniqueId();
    }

    private final String generateUniqueId() {
        totalUsers = getTotalUsers() + 1;
        return "User-"+totalUsers;
    }

    public User(String name, String contactInfo){
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User otherUser){
        this.userId = generateUniqueId();
        this.name = otherUser.getName();
        this.contactInfo = otherUser.getContactInfo();
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();

    public static int getTotalUsers(){
        return totalUsers;
    }

}
