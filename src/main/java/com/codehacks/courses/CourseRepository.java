package com.codehacks.courses;

import com.codehacks.topic.*;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author E238958
 */
public interface CourseRepository extends CrudRepository<Course, String> {
    
}
