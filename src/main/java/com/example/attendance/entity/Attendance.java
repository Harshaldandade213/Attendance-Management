package com.example.attendance.entity;

import com.example.attendance.enums.AttendanceStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(
        uniqueConstraints = @UniqueConstraint(columnNames = {"student_id", "date"})
)
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus status;
}
