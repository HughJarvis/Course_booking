package com.codeclan.example.Course_booking_lab.controllers;


import com.codeclan.example.Course_booking_lab.Repositories.BookingsRepository.BookingsRepository;
import com.codeclan.example.Course_booking_lab.models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingsController {

    @Autowired
    BookingsRepository bookingsRepository;

    @GetMapping(value="/date/{date}")
    public List<Booking> getBookingsForGivenDate(@PathVariable String date){
       return bookingsRepository.getBookingsByDate(date);
    }
}
