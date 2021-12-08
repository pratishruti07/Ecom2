package com.sboot.Ecom.controller;

import com.sboot.Ecom.model.Address;
import com.sboot.Ecom.model.Customer;
import com.sboot.Ecom.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/deliveryAddress")
    public ModelAndView routToAddressPage() {

        ModelAndView modelAndView =new ModelAndView("deliveryAddress");

        return modelAndView;
    }

    @PostMapping("/address/{customerId}")
    public ModelAndView addAddress(Address address,@PathVariable int customerId){
        address.setCustomerId(customerId);
        Address savedAddress=addressService.saveCustomerAddress(address);
        System.out.println("Address saved !! :"+savedAddress);
        ModelAndView modelAndView =new ModelAndView("payment");
        return modelAndView;
    }
}
