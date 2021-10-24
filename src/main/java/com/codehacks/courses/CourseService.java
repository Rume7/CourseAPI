package com.codehacks.courses;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;
    
    public List<Course> getAllCourses(String id) {
        List<Course> allCourses = new ArrayList<>();
        courseRepository.findCoursesByTopicId(id)
                .forEach(allCourses::add);
        return allCourses;
    }
    
    public Course getCourse(String id) {
        return courseRepository.findById(id).orElseThrow();
    }
    
    public void addCourse(Course topic) {
        courseRepository.save(topic);
    }
    
    public void updateCourse(Course topic) {
        courseRepository.save(topic);
    }
    
    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
