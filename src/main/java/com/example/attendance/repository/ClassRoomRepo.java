package com.example.attendance.repository;

import com.example.attendance.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassRoomRepo extends JpaRepository<ClassRoom,Long> {
    List<ClassRoom> findByTeacherId(Long teacherId);
}
