package com.habuma.domain.spitter.persistence;


public class Spitter {

    private String username;
    private String password;
    private String fullname;
    private String email;
    private boolean updatedByEmail;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isUpdatedByEmail() {
        return updatedByEmail;
    }

    public void setUpdatedByEmail(boolean updatedByEmail) {
        this.updatedByEmail = updatedByEmail;
    }
}
