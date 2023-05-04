package com.surveyapi.surveyapi.repository;

import com.surveyapi.surveyapi.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface surveyRepository extends JpaRepository<student,Integer> {
}
