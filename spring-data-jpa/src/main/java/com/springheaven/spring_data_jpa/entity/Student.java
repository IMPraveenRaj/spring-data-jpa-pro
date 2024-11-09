package com.springheaven.spring_data_jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Builder
@AllArgsConstructor
public class Student {

@Id
@Column(name="student_id")
private int id;

@Column(name="student_name")
private String name;

    public Student() {
        //Entity required default constructor

    }
}
