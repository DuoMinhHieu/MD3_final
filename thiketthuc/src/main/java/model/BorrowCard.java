package model;

import java.util.Date;

public class BorrowCard {
    private int borrowId;
    private int bookId;
    private int studentId;
    private boolean status;
    private Date borrowDate;
    private Date returnDate;

    // Constructor
    public BorrowCard(int borrowId, int bookId, int studentId, boolean status, Date borrowDate, Date returnDate) {
        this.borrowId = borrowId;
        this.bookId = bookId;
        this.studentId = studentId;
        this.status = status;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public BorrowCard() {

    }

    // Getters and setters
    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BorrowCard{" +
                "borrowId=" + borrowId +
                ", bookId=" + bookId +
                ", studentId=" + studentId +
                ", status=" + status +
                ", borrowDate=" + borrowDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
