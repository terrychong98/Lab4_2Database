package com.example.taruc.lab4_2database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "user")
public class User {
    @PrimaryKey //make phone primary key
    @NonNull    // phone can not be null
    private String Phone;

    private String firstName;

    private String lastName;

    public User() {
    }

    public User(@NonNull String phone, String firstName, String lastName) {
        this.Phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @NonNull
    public String getPhone() {
        return Phone;
    }

    public void setPhone(@NonNull String phone) {
        Phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
