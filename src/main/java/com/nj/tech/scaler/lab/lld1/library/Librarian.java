package com.nj.tech.scaler.lab.lld1.library;

/*
 * Created by Ninad Jingare on  Date: 06-12-2024
 */
public class Librarian extends User{

    private String employeeNumber;

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("employeeNumber: "+ getEmployeeNumber());
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book){
        //
    }

    public void removeBook(Book book){
        //
    }
}
