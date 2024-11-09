package com.springheaven.spring_data_jpa.dao;

import com.springheaven.spring_data_jpa.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAO {


    @Autowired
    EntityManager em;


@Transactional
    public void save(Student student) {
        em.persist(student);
    }
}
