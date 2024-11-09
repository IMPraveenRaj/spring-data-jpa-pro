package com.springheaven.spring_data_jpa;

import com.springheaven.spring_data_jpa.dao.StudentDAO;
import com.springheaven.spring_data_jpa.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Slf4j
public class SpringDataJpaApplication implements
		CommandLineRunner {

	@Autowired
	StudentDAO studentDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	log.info("hello world");
		Student student=Student.builder().id(101).
				name("omsairam").build();
		studentDAO.save(student);

	}
}
