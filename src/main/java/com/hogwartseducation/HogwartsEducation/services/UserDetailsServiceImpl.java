package com.hogwartseducation.HogwartsEducation.services;

import com.hogwartseducation.HogwartsEducation.models.Student;
import com.hogwartseducation.HogwartsEducation.repositories.StudentRepository;
import com.hogwartseducation.HogwartsEducation.security.StudentDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final StudentRepository studentRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Student> optionalStudent = studentRepository.findByEmail(username);

        if (optionalStudent.isEmpty())
            throw new UsernameNotFoundException(String.format("User not found with email: %s", username));
        return new StudentDetails(optionalStudent.get());
    }
}
