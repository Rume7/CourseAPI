package com.codehacks.courses;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository topicRepository;
    
    public List<Course> getAllTopics() {
        List<Course> allTopics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(allTopics::add);
        return allTopics;
    }
    
    public Course getTopic(String id) {
        return topicRepository.findById(id).orElseThrow();
    }
    
    public void addTopic(Course topic) {
        topicRepository.save(topic);
    }
    
    public void updateTopic(String id, Course topic) {
        topicRepository.save(topic);
    }
    
    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
