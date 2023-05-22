package com.hogwartseducation.HogwartsEducation.repositories;

import com.hogwartseducation.HogwartsEducation.models.StudentProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentProgressRepository extends JpaRepository<StudentProgress, Integer> {
    Optional<StudentProgress> findStudentProgressByEmail(String email);
}