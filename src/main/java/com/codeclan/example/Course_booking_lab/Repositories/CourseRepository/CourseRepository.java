package com.codeclan.example.Course_booking_lab.Repositories.CourseRepository;

import com.codeclan.example.Course_booking_lab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    public List<Course> getCoursesByRating(int rating);

    public List<Course> getCoursesByBookingsCustomerId(Long id);
}
