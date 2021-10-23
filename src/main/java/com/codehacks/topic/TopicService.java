package com.codehacks.topic;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    List<Topic> topics = Arrays.asList(
            new Topic("Spring", "Spring Framework", "Spring Framework Description"),
            new Topic("Vaadin", "Vaadin Framework", "Frontend Framework"),
            new Topic("JSF", "JavaServer Faces", "JSF Framework Description")
        );
    
    public List<Topic> getAllTopics(){
        return topics;
    }
    
    public Topic getTopic(String id) {
        return topics.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst().get();
    }
    
    public void addTopic() {
        
    }
}
