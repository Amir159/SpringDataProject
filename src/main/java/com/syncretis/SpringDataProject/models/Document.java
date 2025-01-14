package com.syncretis.SpringDataProject.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "document")
public class Document {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "expiry_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date expireDate;

    @OneToOne(mappedBy = "document",cascade = CascadeType.REMOVE)
    private Person person;

    public Document() {
    }

    public Document(String number, Date expireDate) {
        this.number = number;
        this.expireDate = expireDate;
    }

    public Document(String number, Date expireDate, Person person) {
        this.number = number;
        this.expireDate = expireDate;
        this.person = person;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
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

    public String getPerson() {
        return person.getSecondName();
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id='" + id + '\'' +
                ", number='" + number + '\'' +
                ", expireDate=" + expireDate +
                '}';
    }
}
