/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iit.ozone.lms.entity;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Sahan Thinusha
 */
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String title;

    private String description;
    
    private String isbn;

    private String year;

    private String callNumber;

    private String edition;

    private String coverImage;
    private List<BorrowRecord> borrowRecordList;

    private Author authorid;

    private Category categoryid;

    private Publisher publisherid;
    private List<Reservation> reservationList;

    public Book() {
    }

    public Book(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public List<BorrowRecord> getBorrowRecordList() {
        return borrowRecordList;
    }

    public void setBorrowRecordList(List<BorrowRecord> borrowRecordList) {
        this.borrowRecordList = borrowRecordList;
    }

    public Author getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Author authorid) {
        this.authorid = authorid;
    }

    public Category getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Category categoryid) {
        this.categoryid = categoryid;
    }

    public Publisher getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(Publisher publisherid) {
        this.publisherid = publisherid;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
     public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iit.ozone.lms.database.entity.Book[ id=" + id + " ]";
    }

}
