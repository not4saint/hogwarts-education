package com.hogwartseducation.HogwartsEducation.services;


import com.hogwartseducation.HogwartsEducation.models.House;
import com.hogwartseducation.HogwartsEducation.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findStudentsInSelectedHouse(House house);
    Optional<Student> findByEmail(String email);
}
