package com.springjdbc.main;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springjdbc.dao.Persondao;

@Configuration
@ComponentScan(basePackages = "com.springjdbc.dao")
public class Config {
	
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds =  new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUsername("root");
		ds.setPassword("Awanish@7765");
		ds.setUrl("jdbc:mysql://localhost:3306/springdatabase");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	public Persondao getPersondao() {
		Persondao persondao = new Persondao();
		
		persondao.setJdbcTemplate(getTemplate());
		
		return persondao;
	}

}
