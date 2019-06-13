package com.codeclan.example.Course_booking_lab;

import com.codeclan.example.Course_booking_lab.Repositories.BookingsRepository.BookingsRepository;
import com.codeclan.example.Course_booking_lab.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.Course_booking_lab.Repositories.CustomerRepository.CustomerRepository;
import com.codeclan.example.Course_booking_lab.models.Booking;
import com.codeclan.example.Course_booking_lab.models.Course;
import com.codeclan.example.Course_booking_lab.models.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseBookingLabApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingsRepository bookingsRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetCoursesByRating() {
		assertEquals(1, courseRepository.getCoursesByRating(4).size());
	}

	@Test
	public void canGetBookingsByDate() {
		assertEquals(1, bookingsRepository.getBookingsByDate("12-07-19").size());
	}

	@Test
	public void canGetCustomersByCourse() {
		assertEquals(2, customerRepository.getCustomersByBookingsCourseName("Java").size());
	}

	@Test
	public void canGetCustomersByCourseId() {
		assertEquals(1,customerRepository.getCustomersByBookingsCourseId(1L).size() );
	}

	@Test
	public void canGetCoursesByCustomerId() {
		assertEquals(1, courseRepository.getCoursesByBookingsCustomerId(1L).size());
	}

	@Test
	public void canGetCustomersByTownAndCourse() {
		assertEquals(2, customerRepository.getCustomersByTownAndBookingsCourseId("Glasgow", 2L).size());
	}

	@Test
	public void canGetCustomersByAgeTownAndCourse() {
		assertEquals(1, customerRepository.getCustomersByTownAndAgeGreaterThanAndBookingsCourseId("Glasgow", 25, 2L).size());
	}

	@Test
	public void canGetCustomersByAgeTownAndCourse2() {
		assertEquals(1, customerRepository.getCustomersByTownAndAgeGreaterThanAndBookingsCourseId("Dundee", 25, 1L).size());
		assertEquals(0, customerRepository.getCustomersByTownAndAgeGreaterThanAndBookingsCourseId("Dundee", 29, 1L).size());
	}
}
