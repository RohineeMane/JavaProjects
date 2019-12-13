package com.scp.java.config;



import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


@Configuration
@ComponentScan(basePackages = {"com.scp.java.*"})
public class RegistrationConfig {
		
	@Bean("ds")
	public BasicDataSource basicDataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/registration");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		return ds;
	}
	
	@Bean("sfactory")
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean ls = new LocalSessionFactoryBean();
		ls.setDataSource(basicDataSource());
		ls.setHibernateProperties(initializeHibernateProps());
		ls.setPackagesToScan("com.scp.java.entities");
		return ls;
	}
	
	private Properties initializeHibernateProps() {
		Properties props =new Properties();
		props.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		props.put(Environment.HBM2DDL_AUTO,"create-drop");
		props.put(Environment.SHOW_SQL,"true");
		return props;
	}
}
