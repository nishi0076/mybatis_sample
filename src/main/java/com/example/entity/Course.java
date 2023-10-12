package com.example.entity;

import java.util.List;

// MyBatisではEntityにアノテーションを記述しない
public class Course {

	private Integer id;
	private String name;
	
	// 紐づくテーブルのクラスのフィールドとgetter,setterを定義する(1対1)
	private CourseDetail courseDetail;
	
	// 紐づくテーブルのクラスのフィールドとgetter,setterを定義する(1対多)
    private List<Chapter> chapters;
	
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CourseDetail getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(CourseDetail courseDetail) {
		this.courseDetail = courseDetail;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
}
