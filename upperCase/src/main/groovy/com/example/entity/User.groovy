package com.example.entity

import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable

@Introspected
@Serdeable
class User {
    String name
    String email
    Long phone
    String address
    String password

    User(String name, String password, String address, Long phone, String email) {
        this.name = name
        this.password = password
        this.address = address
        this.phone = phone
        this.email = email
    }

    @Override
    String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
