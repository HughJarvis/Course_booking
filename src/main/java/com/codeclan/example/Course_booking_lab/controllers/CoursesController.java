package com.codeclan.example.Course_booking_lab.controllers;

import com.codeclan.example.Course_booking_lab.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.Course_booking_lab.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CoursesController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value="/rating/{rating}")
    public List<Course> getCoursesWithGivenRating(@PathVariable int rating){
        return courseRepository.getCoursesByRating(rating);
    }

    @GetMapping(value="/customer/{id}")
    public List<Course> getCoursesForGivenCustomer(@PathVariable Long id){
        return courseRepository.getCoursesByBookingsCustomerId(id);
    }
}
