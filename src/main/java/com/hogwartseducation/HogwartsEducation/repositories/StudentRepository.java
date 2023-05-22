package com.hogwartseducation.HogwartsEducation.repositories;

import com.hogwartseducation.HogwartsEducation.models.House;
import com.hogwartseducation.HogwartsEducation.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByHouse(House house);
    Optional<Student> findByEmail(String email);
}
