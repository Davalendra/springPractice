package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Employees;
import com.multiclass.SimTest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);
//		SimTest s = container.getBean("simTest",SimTest.class);
//		s.test();
		ApplicationContext container=new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate jd = container.getBean("template",JdbcTemplate.class);
	    Employees emp = jd.queryForObject("select * from employee where id =2", (rs,rowNum)->new Employees(rs.getInt(1),rs.getString(2),rs.getInt(3)));
	    System.out.println(emp);
	}

	private static void selectAll(JdbcTemplate jd) {
		List<Employees> emp = jd.query("Select * from employee", new RowMapper<Employees>() {

			@Override
			public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new Employees(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
	    });
	    System.out.println(emp);
	}

	private static void selectOnOne(JdbcTemplate jd) {
		Employees emp = jd.queryForObject("Select * from employee where id=2",new RowMapper<Employees>()
	    		{

					@Override
					public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {
						return new Employees(rs.getInt(1),rs.getString(2),rs.getInt(3));
					}
	    	
	    		});
	    	System.out.println(emp);
	}

	private static void dmlSpring(JdbcTemplate jd) {
		jd.update("insert into employee values(?,?,?)",1,"Fayaz",2000);
		jd.update("update employee set salary=? where id=?",10000,1);
		System.out.println("updated..");
		
		jd.update("delete from employee where id=?",1);
		System.out.println("update..");
	}

}
