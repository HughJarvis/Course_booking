package com.codeclan.example.Course_booking_lab.controllers;


import com.codeclan.example.Course_booking_lab.Repositories.CustomerRepository.CustomerRepository;
import com.codeclan.example.Course_booking_lab.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{id}")
    public List<Customer> getCustomersForGivenCourse(@PathVariable Long id){
        return customerRepository.getCustomersByBookingsCourseId(id);
    }


    @GetMapping(value="/town/{town}/course/{id}")
    public List<Customer> getCustomersByTownAndBookingsCourseId(@PathVariable String town, @PathVariable Long id) {
        return customerRepository.getCustomersByTownAndBookingsCourseId(town, id);
    }

    @GetMapping(value= "/town/{town}/age/{age}/course/{id}")
    public List<Customer> getCustomersByTownAndCourseOverAge(@PathVariable String town, @PathVariable int age, @PathVariable Long id) {
        return customerRepository.getCustomersByTownAndAgeGreaterThanAndBookingsCourseId( town, age, id);
    }


}
