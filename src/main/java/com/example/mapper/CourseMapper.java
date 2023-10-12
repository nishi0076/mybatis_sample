package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.entity.Course;

@Mapper
public interface CourseMapper {

	public List<Course> findAll(@Param("courseId") Integer courseId, @Param("courseName") String courseName);
	
	// 新規登録用メソッド
	public void insert(Course course);
	
	// データ1件取得用メソッド
	public Course findById(Integer id);
	
	// 更新用メソッド
	public void update(Course course);
	
	// 削除用メソッド
	public void deleteById(Integer id);
}
