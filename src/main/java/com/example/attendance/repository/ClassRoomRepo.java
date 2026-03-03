package com.example.attendance.repository;

import com.example.attendance.entity.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClassRoomRepo extends JpaRepository<ClassRoom,Long> {
    List<ClassRoom> findByTeacherId(Long teacherId);
}
