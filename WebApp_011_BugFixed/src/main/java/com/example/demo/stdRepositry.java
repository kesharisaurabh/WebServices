package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stdRepositry 
{
	List<student> ltstu=new ArrayList<student>();
	@GetMapping
	@RequestMapping("getstd")
	public List<student> getStudent()
	{
		
		
		student std1=new student();
		std1.setSid(11);
		std1.setName("saurabh");
		std1.setPoints(11);
		
		student std2=new student();
		std2.setSid(22);
		std2.setName("keshari");
		std2.setPoints(22);
		
		ltstu.add(std1);
		ltstu.add(std2);
		
		return ltstu;
	}
	
	
	@PostMapping
	@RequestMapping("poststd")
	public student SetStu(@RequestBody student sts)
	{
		System.out.println(sts);
		ltstu.add(sts);		
		System.out.println(ltstu);
		return sts;
	}
	
}
