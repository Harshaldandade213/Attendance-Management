package com.example.attendance.controller;

import com.example.attendance.entity.Attendance;
import com.example.attendance.enums.AttendanceStatus;
import com.example.attendance.service.AttendanceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService){
        this.attendanceService=attendanceService;
    }
    @PostMapping("mark")
    public Attendance markAttendance(
            @RequestParam Long studentId,
            @RequestParam String date,
            @RequestParam AttendanceStatus status
            ){
        return  attendanceService.markAttendance(studentId, LocalDate.parse(date), status);
    }
}
