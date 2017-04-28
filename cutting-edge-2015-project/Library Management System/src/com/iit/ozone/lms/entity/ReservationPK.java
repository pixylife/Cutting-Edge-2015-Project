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
public class ReservationPK implements Serializable {
    
    private int id;
   
    private String userId;
    
    private String bookid;

    public ReservationPK() {
    }

    public ReservationPK(int id, String userId, String bookid) {
        this.id = id;
        this.userId = userId;
        this.bookid = bookid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (userId != null ? userId.hashCode() : 0);
        hash += (bookid != null ? bookid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReservationPK)) {
            return false;
        }
        ReservationPK other = (ReservationPK) object;
        if (this.id != other.id) {
            return false;
        }
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        if ((this.bookid == null && other.bookid != null) || (this.bookid != null && !this.bookid.equals(other.bookid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.iit.ozone.lms.database.entity.ReservationPK[ id=" + id + ", userId=" + userId + ", bookid=" + bookid + " ]";
    }
    
}
