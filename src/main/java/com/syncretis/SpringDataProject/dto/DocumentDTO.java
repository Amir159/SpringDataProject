package com.syncretis.SpringDataProject.dto;

import com.syncretis.SpringDataProject.models.Person;

import java.util.Date;

public class DocumentDTO {
    private String id;
    private String number;
    private Date expireDate;

    public DocumentDTO() {
    }

    public DocumentDTO(String number, Date expireDate) {
        this.number = number;
        this.expireDate = expireDate;
    }

    public DocumentDTO(String id, String number, Date expireDate, Person person) {
        this.id = id;
        this.number = number;
        this.expireDate = expireDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
