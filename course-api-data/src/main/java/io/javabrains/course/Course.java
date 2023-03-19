package io.javabrains.course;


import io.javabrains.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    private String id;
    private String name;
    private String description;
    //There could be many courses associated with a topic so this relationship between course and topic is many to one
    @ManyToOne
    private Topic topic;

    public Course(){

    }
    public Course(String id, String name, String description, String topicId) {
        super();
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
        this.setTopic(new Topic(topicId, "", "")) ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
