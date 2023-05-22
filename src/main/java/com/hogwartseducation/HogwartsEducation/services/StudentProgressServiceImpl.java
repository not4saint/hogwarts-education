package com.hogwartseducation.HogwartsEducation.services;

import com.hogwartseducation.HogwartsEducation.models.StudentProgress;
import com.hogwartseducation.HogwartsEducation.repositories.StudentProgressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StudentProgressServiceImpl implements StudentProgressService {
    private final StudentProgressRepository studentProgressRepository;
    @Override
    public StudentProgress findStudentProgressByEmail(String email) {
        return studentProgressRepository.findStudentProgressByEmail(email)
                                        .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
