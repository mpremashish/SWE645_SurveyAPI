package com.surveyapi.surveyapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    String id;

    String firstName;

    String lastName;

    String streetAddress;

    String addre
}
