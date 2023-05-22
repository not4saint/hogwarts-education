package com.hogwartseducation.HogwartsEducation.facades;

import com.hogwartseducation.HogwartsEducation.dto.StudentDTO;
import com.hogwartseducation.HogwartsEducation.dto.StudentProgressDTO;
import com.hogwartseducation.HogwartsEducation.mappers.StudentMapper;
import com.hogwartseducation.HogwartsEducation.mappers.StudentProgressMapper;
import com.hogwartseducation.HogwartsEducation.models.House;
import com.hogwartseducation.HogwartsEducation.models.Student;
import com.hogwartseducation.HogwartsEducation.models.StudentProgress;
import com.hogwartseducation.HogwartsEducation.security.StudentDetails;
import com.hogwartseducation.HogwartsEducation.services.StudentProgressServiceImpl;
import com.hogwartseducation.HogwartsEducation.services.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class HousePageFacade {
    private final StudentServiceImpl studentService;
    private final StudentProgressServiceImpl studentProgressService;
    private final StudentMapper studentMapper;
    private final StudentProgressMapper studentProgressMapper;

    public List<StudentDTO> convertAndFindStudentsInSelectedHouse(String house) {
        List<Student> studentList = studentService.findStudentsInSelectedHouse(House.valueOf(house.toUpperCase()));
        return studentList.stream().map(st -> studentMapper.toStudentDTO(st)).toList();
    }

    public StudentProgressDTO convertAndFindStudentProgressByEmail() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        StudentDetails studentDetails = (StudentDetails) authentication.getPrincipal();
        StudentProgress studentProgress = studentProgressService.findStudentProgressByEmail(studentDetails.getUsername());

        return studentProgressMapper.toStudentProgressDTO(studentProgress);
    }
}
