package com.hogwartseducation.HogwartsEducation.utils;

import com.hogwartseducation.HogwartsEducation.models.Student;
import com.hogwartseducation.HogwartsEducation.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class StudentValidator implements Validator {
    private final StudentService studentService;

    @Override
    public boolean supports(Class<?> clazz) {
        return Student.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Student student = (Student) target;

        Optional<Student> optionalStudent = studentService.findByEmail(student.getEmail());
        if (optionalStudent.isPresent())
            errors.rejectValue("email", "", "User already registered");
    }
}
