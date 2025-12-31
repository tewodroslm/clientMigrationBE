package com.uw.clientMigration.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @Date 12/31/25
 */

@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private String firstName;
    private String status;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String lastName) {
        status = lastName;
    }
}
