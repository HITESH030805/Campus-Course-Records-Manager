package edu.ccrm.service;

import edu.ccrm.domain.Course;
import edu.ccrm.domain.Semester;
import java.util.List;
import java.util.stream.Collectors;

public class CourseService {
    private final DataStore dataStore = DataStore.getInstance();

    public void addCourse(Course course) {
        dataStore.addCourse(course);
    }

    public List<Course> getAllCourses() {
        return dataStore.getAllCourses();
    }

    public List<Course> findCoursesByDepartment(String department) {
        return dataStore.getAllCourses().stream()
                .filter(course -> course.getCode().getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    public List<Course> findCoursesBySemester(Semester semester) {
        return dataStore.getAllCourses().stream()
                .filter(course -> course.getSemester() == semester)
                .collect(Collectors.toList());
    }
}