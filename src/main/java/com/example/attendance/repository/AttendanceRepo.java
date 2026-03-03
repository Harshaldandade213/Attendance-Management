package com.example.attendance.repository;

import com.example.attendance.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
@Repository
public interface AttendanceRepo extends JpaRepository<Attendance, Long> {
    boolean existsByStudentIdAndDate(Long studentId, LocalDate date);
}
