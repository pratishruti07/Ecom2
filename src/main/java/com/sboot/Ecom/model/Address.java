package com.sboot.Ecom.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    private Integer customerId;
    private String prodId;
    private String price;
    private String quantity;

    private String country;
    private String fullName;
    private String mobileNumber;
    private String pinCode;
    private String houseNumber;
    private String landmark;
    private String city;
    private String state;
    private String addressType;
}

