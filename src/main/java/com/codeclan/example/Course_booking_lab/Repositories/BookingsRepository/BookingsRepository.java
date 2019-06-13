package com.codeclan.example.Course_booking_lab.Repositories.BookingsRepository;

import com.codeclan.example.Course_booking_lab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingsRepository extends JpaRepository<Booking, Long> {

    public List<Booking> getBookingsByDate(String date);
}
