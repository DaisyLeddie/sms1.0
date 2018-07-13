package com.briup.app03.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app03.bean.Student;
import com.briup.app03.dao.StudentMapper;
import com.briup.app03.service.IStudentService;
@Service 
//  *****错误 : 是相当于缺货

//  由这个去实现那个继承的接口 ，抽象类的 不能创建实例
public class StudentServiceImpl implements IStudentService{
	@Autowired
//	自动注册
	private  StudentMapper studentMapper ;
	@Override
//	---------------------------------------------------
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
//		调用studentMapper 查询所有学生
		List<Student> list = studentMapper.findAll();
		return list;
	}
//	---------------------------------------
	public Student findById(long id) throws Exception {
		Student student = studentMapper.findById(id);
		return student ;
		
	}
	@Override
	public Student insertId(long id, String name, int age) throws Exception {
		// TODO Auto-generated method stub
		Student student = studentMapper.insertId(id,name,age);
		return student ;
	}
	@Override
	public void save(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.save(student);
	}
	@Override
	public void updata(Student student) throws Exception {
		// TODO Auto-generated method stub
//		Student student2 = studentMapper.findById(id);
//		if (student2 != null)
//		{
			studentMapper.updata(student);
			
//		}
//		else
//		{
//			throw  new Exception("修改的学生不存在!");
//		}
	}
	@Override
	public void dele(long id) throws Exception {
		// TODO Auto-generated method stub
//		1.通过创建一个Student 来查询是否存在，如果存在的话，那么就输出
		
		Student student = studentMapper.findById(id);
		if(student != null){
		studentMapper.dele(id);
		} else 
		{
			throw  new Exception("删除的学生不存在!");
		}
		
//		1
	}
	@Override
	public Student findIS(Student student) throws Exception {
		// TODO Auto-generated method stub
		Student student =   studentMapper.findIS(student);
		return student;
	}
	 
	 
}
