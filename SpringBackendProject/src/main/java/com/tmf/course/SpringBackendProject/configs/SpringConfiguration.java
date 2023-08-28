package com.tmf.course.SpringBackendProject.configs;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.tmf")
@EnableTransactionManagement
public class SpringConfiguration {
	
	public DataSource getDataSource() {
		System.out.println("Data source has been called");
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/cijd_7949");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	public Properties getHibernateProperties() {
		System.out.println("Hibernate properties has been called");
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		return props;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		System.out.println("Session factory is called");
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setHibernateProperties(getHibernateProperties());
		sf.setDataSource(getDataSource());
		sf.setPackagesToScan("com.tmf.course.SpringBackendProject.beans");
		System.out.println("Session factory has been created");
		return sf;
	}
	
	@Bean
	public HibernateTransactionManager getManager(SessionFactory sf) {
		HibernateTransactionManager tx = new HibernateTransactionManager(sf);
		System.out.println("Transaction manager has been created");
		return tx;
	}
}









