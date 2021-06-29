package com.main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.dao.Studentdao;

@Configuration
public class Config {
	
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setPassword("Awanish@7765");
		ds.setUsername("root");
		ds.setUrl("jdbc:mysql://localhost:3306/springdatabase");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	
	@Bean(name= {"dao"})
	public Studentdao getStudentdao() {
		
		Studentdao dao = new Studentdao();
		dao.setJdbcTemplate(getTemplate());
		return dao;
	}
	
	
}
