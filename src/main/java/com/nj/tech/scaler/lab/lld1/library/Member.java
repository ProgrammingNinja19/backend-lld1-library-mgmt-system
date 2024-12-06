package com.nj.tech.scaler.lab.lld1.library;

/*
 * Created by Ninad Jingare on  Date: 06-12-2024
 */
public class Member extends User {
    private int borrowedBookCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public int getBorrowedBookCount() {
        return borrowedBookCount;
    }

    public void setBorrowedBookCount(int borrowedBookCount) {
        this.borrowedBookCount = borrowedBookCount;
    }

    @Override
    public void displayDashboard(){
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed: "+getBorrowedBookCount());
    }

    @Override
    public boolean canBorrowBooks() {
        return this.borrowedBookCount<MAX_BORROW_LIMIT;
    }
}
