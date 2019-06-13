package com.codeclan.example.Course_booking_lab.components;

import com.codeclan.example.Course_booking_lab.Repositories.BookingsRepository.BookingsRepository;
import com.codeclan.example.Course_booking_lab.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.Course_booking_lab.Repositories.CustomerRepository.CustomerRepository;
import com.codeclan.example.Course_booking_lab.models.Booking;
import com.codeclan.example.Course_booking_lab.models.Course;
import com.codeclan.example.Course_booking_lab.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingsRepository bookingsRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Course course1 = new Course ("Python", "Glasgow", 4);
        courseRepository.save(course1);
        Course course2 = new Course ("Java", "Edinburgh", 2);
        courseRepository.save(course2);

        Customer customer1 = new Customer ("Johnny", "Glasgow", 18);
        customerRepository.save(customer1);
        Customer customer3 = new Customer ("James", "Glasgow", 26);
        customerRepository.save(customer3);
        Customer customer2 = new Customer ("Penelope", "Dundee", 28);
        customerRepository.save(customer2);

        Booking booking1 = new Booking ("12-07-19", customer2, course1);
        bookingsRepository.save(booking1);
        Booking booking2 = new Booking ("15-07-19", customer1, course2);
        bookingsRepository.save(booking2);
        Booking booking3 = new Booking ("15-07-19", customer3, course2);
        bookingsRepository.save(booking3);


    }
}
