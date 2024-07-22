package com.example.cellphone.model;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String image;
    private boolean status;
//    @ManyToOne
//    @JoinColumn(name = "idRole")
//    private Role idRole;

    public User() {
    }

    public User(String address, String email, long id, String image, String name, String password, String phoneNumber, boolean status) {
        this.address = address;
        this.email = email;
        this.id = id;
//        this.idRole = idRole;
        this.image = image;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public Role getIdRole() {
//        return idRole;
//    }
//
//    public void setIdRole(Role idRole) {
//        this.idRole = idRole;
//    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}