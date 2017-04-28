/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.entity;

import java.io.Serializable;

/**
 *
 * @author Sahan Thinusha
 */
public class BorrowRecord implements Serializable {

    private static final long serialVersionUID = 1L;
    protected BorrowRecordPK borrowRecordPK;

    private String checkoutDate;
    private String returnDate;
    private Integer status;

    private Book book;

    private User user;

    public BorrowRecord() {
    }

    public BorrowRecord(BorrowRecordPK borrowRecordPK) {
        this.borrowRecordPK = borrowRecordPK;
    }

    public BorrowRecord(int id, String userId, String bookid) {
        this.borrowRecordPK = new BorrowRecordPK(id, userId, bookid);
    }

    public BorrowRecordPK getBorrowRecordPK() {
        return borrowRecordPK;
    }

    public void setBorrowRecordPK(BorrowRecordPK borrowRecordPK) {
        this.borrowRecordPK = borrowRecordPK;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (borrowRecordPK != null ? borrowRecordPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BorrowRecord)) {
            return false;
        }
        BorrowRecord other = (BorrowRecord) object;
        if ((this.borrowRecordPK == null && other.borrowRecordPK != null) || (this.borrowRecordPK != null && !this.borrowRecordPK.equals(other.borrowRecordPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iit.ozone.lms.database.entity.BorrowRecord[ borrowRecordPK=" + borrowRecordPK + " ]";
    }

}
