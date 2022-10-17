package com.example.DatabaseMockDatabase.entitis;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStudent;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
}
