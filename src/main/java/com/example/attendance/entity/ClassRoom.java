package com.example.attendance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String section;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private User teacher;
}
