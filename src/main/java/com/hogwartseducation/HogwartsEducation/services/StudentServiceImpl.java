package com.hogwartseducation.HogwartsEducation.services;

import com.hogwartseducation.HogwartsEducation.models.House;
import com.hogwartseducation.HogwartsEducation.models.Student;
import com.hogwartseducation.HogwartsEducation.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public List<Student> findStudentsInSelectedHouse(House house) {
        List<Student> studentList = studentRepository.findAllByHouse(house);
        if (studentList.isEmpty()) {
            return Collections.emptyList();
        }
        return studentList;
    }

    @Override
    public Optional<Student> findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }


}
