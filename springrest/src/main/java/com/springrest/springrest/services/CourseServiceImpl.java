package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145, "Java Core Course", "this course contains basics of java"));
//		list.add(new Course(4343, "Spring Boot Course", "creating REST api using spring boot"));
		
	}
	
	@Override
	@Transactional
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	@Transactional
	public Course getCourse(long courseId) {
//		Course course = null;
//		
//		for (Course c : list) {
//			if (c.getId() == courseId) {
//				course = c;
//				break;
//			}
//		}
		
		return courseDao.findById(courseId).get();
	}

	@Override
	@Transactional
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	@Transactional
	public Course updateCourse(Course course) {
//		for (Course c : list) {
//			if (c.getId() == course.getId()) {
//				c.setDescription(course.getDescription());
//				c.setTitle(course.getTitle());
//				break;
//			}
//		}
		
		courseDao.save(course);
		
		return course;
	}

	@Override
	@Transactional
	public void deleteCourse(Long courseId) {
//		list = this.list.stream().filter(c -> c.getId() != courseId).collect(Collectors.toList());
		Course entityCourse = courseDao.getReferenceById(courseId);
		courseDao.delete(entityCourse);
	}

}
