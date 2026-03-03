package com.example.attendance.service;

import com.example.attendance.entity.Attendance;
import com.example.attendance.entity.Student;
import com.example.attendance.enums.AttendanceStatus;
import com.example.attendance.repository.AttendanceRepo;
import com.example.attendance.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class AttendanceService {
    private final AttendanceRepo attendanceRepo ;
    private final StudentRepo studentRepo ;

    public AttendanceService(AttendanceRepo attendanceRepo,
                             StudentRepo studentRepo){
        this.attendanceRepo=attendanceRepo;
        this.studentRepo=studentRepo;

    }
    public Attendance markAttendance(Long studentId, LocalDate date, AttendanceStatus status){
        //to check if student exists
        Student student =studentRepo.findById(studentId)
                .orElseThrow(()-> new RuntimeException("Student Not Found"));

        //check duplicates
        boolean exists =attendanceRepo.existsByStudentIdAndDate(studentId, date);
        if(exists){
            throw new RuntimeException("Attendance already marked for this stduent at this date");

        }
        //create new attendance
        Attendance attendance= new Attendance();
        attendance.setStudent(student);
        attendance.setDate(date);
        attendance.setStatus(status);

        //save
        return attendanceRepo.save(attendance);
    }
}
