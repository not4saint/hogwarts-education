package com.hogwartseducation.HogwartsEducation.services;


import com.hogwartseducation.HogwartsEducation.models.StudentProgress;

public interface StudentProgressService {
    StudentProgress findStudentProgressByEmail(String email);
}
