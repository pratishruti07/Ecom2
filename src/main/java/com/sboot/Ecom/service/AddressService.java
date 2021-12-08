package com.sboot.Ecom.service;

import com.sboot.Ecom.dao.AddressRepository;
import com.sboot.Ecom.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address saveCustomerAddress(Address address){
        return addressRepository.save(address);
    }
}
