package com.codeclan.example.Course_booking_lab.Repositories.CustomerRepository;


import com.codeclan.example.Course_booking_lab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getCustomersByTownAndCourse(String town, Long courseId);

}
