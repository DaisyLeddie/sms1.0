package com.briup.app03.web.controller;

import java.util.List;

import javax.annotation.Generated;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app03.bean.Student;
import com.briup.app03.service.IStudentService;
import com.briup.app03.util.MsgResponse;

@RestController
@RequestMapping("/student")
// 直接写8080：/stduent  就可以直接访问到
public class StudentController {
	@Autowired
	// 自动注入 studentService 的实例
	private IStudentService studentService;
// ---------------------------------------------------------------------------------------------
	@GetMapping("findAllSudents")
	public MsgResponse findAllStudents() {
		try {
			List<Student> list = studentService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
//			这个就是实现类的配置 
		} 
	}
//	--------------------------------------------------------------------------------------
//	controller  实现查询返回情况
	  @GetMapping("findStudentById")
	  public Student findStudentById(long id){
		  try {
			  Student  student =  studentService.findById(id);
			  return  student ;
			  
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null; 
		}
		  
	  }
	 @GetMapping("insrtstudents")
	 public Student insrtstudents(long id,String name,int age){
		 try {
			Student student = studentService.insertId(id,name,age);
			return student ;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	 }
	 /**
	  * 保存学生信息
	  * @author Administrator
	  * @param  student
	  * @return
	  * 
	  */
	 @PostMapping("saveStudent")
	 public String saveStudent(Student student){
		 try {
			studentService.save(student);
			return "修改成功";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		 
	 }
	 @PostMapping("updataStudent")
	 public MsgResponse updataStudent(Student student){
		 try {
			studentService.updata(student);
			return MsgResponse.success("修改成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	 }
	@GetMapping("deleteStudent")
	public MsgResponse deleteStudent(long id){
		try {
			studentService.dele(id);
			return MsgResponse.success("删除成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("findIS")
	public MsgResponse findIS (Student student){
		try {
			studentService.findIS(student);
			return MsgResponse.success("查询成功", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
}
