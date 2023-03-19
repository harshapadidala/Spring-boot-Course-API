package io.javabrains.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    //you are looking for topic property within Course entity and then within Topic you are looking for Id property
    public List<Course> findByTopicId(String topicId);
}
