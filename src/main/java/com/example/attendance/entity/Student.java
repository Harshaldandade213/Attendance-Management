package com.example.attendance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String roll;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassRoom classRoom;
}
