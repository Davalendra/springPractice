package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Config;
import com.Employees;
import com.multiclass.SimTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
		JdbcTemplate jd = container.getBean("template",JdbcTemplate.class);
		Employees emp = jd.queryForObject("Select * from employee where id=2", (rs,rowNum)->new Employees(rs.getInt(1),rs.getString(2),rs.getInt(3)));
		System.out.println(emp);
	}


}
