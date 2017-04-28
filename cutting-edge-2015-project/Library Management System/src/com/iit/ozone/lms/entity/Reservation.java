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
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    protected ReservationPK reservationPK;

    private String expireDate;

    private Book book;

    private User user;

    public Reservation() {
    }

    public Reservation(ReservationPK reservationPK) {
        this.reservationPK = reservationPK;
    }

    public Reservation(int id, String userId, String bookid) {
        this.reservationPK = new ReservationPK(id, userId, bookid);
    }

    public ReservationPK getReservationPK() {
        return reservationPK;
    }

    public void setReservationPK(ReservationPK reservationPK) {
        this.reservationPK = reservationPK;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
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
        hash += (reservationPK != null ? reservationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.reservationPK == null && other.reservationPK != null) || (this.reservationPK != null && !this.reservationPK.equals(other.reservationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iit.ozone.lms.database.entity.Reservation[ reservationPK=" + reservationPK + " ]";
    }

}
