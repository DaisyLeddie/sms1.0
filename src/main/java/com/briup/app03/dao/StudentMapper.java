package com.briup.app03.dao;

import java.util.List;

import com.briup.app03.bean.Student;

public interface StudentMapper {	
		List<Student> findAll();
//		查询学生信息
		Student findById(long id);
//		插入学生信息
		Student insertId(long id,String name,int age);
//		 保存学生信息
		void save(Student student);
// 		修改学生信息
		void updata(Student student);
//		删除学生信息
		void dele(long id);
//		配合查询
//       Student findIS(Student student);
		
}
