package com.codeclan.example.Course_booking_lab.Repositories.CustomerRepository;

import com.codeclan.example.Course_booking_lab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public List<Customer> getCustomersByBookingsCourseName(String courseName);
    public List<Customer> getCustomersByBookingsCourseId(Long Id);

    public List<Customer> getCustomersByTownAndBookingsCourseId(String town, Long courseId);
    public List<Customer> getCustomersByTownAndAgeGreaterThanAndBookingsCourseId( String town,int age, Long courseId);


}
