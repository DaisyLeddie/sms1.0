package com.briup.app03.service;

import java.util.List;

import com.briup.app03.bean.Student;

public interface IStudentService {
//	----------------------------------------------
//	写抽象的方法; 抽象的方法是没有得以去实现的
	List<Student> findAll() throws Exception;
//	-----------------------------------------------
	Student findById(long id) throws  Exception;
	Student insertId(long id ,String name,int age) throws Exception;
	void save(Student student) throws Exception;
	void  updata(Student student) throws Exception;
	void dele(long id) throws Exception;
//	Student findIS(Student student) throws Exception;
}
