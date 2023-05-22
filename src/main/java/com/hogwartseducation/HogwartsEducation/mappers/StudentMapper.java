package com.hogwartseducation.HogwartsEducation.mappers;


import com.hogwartseducation.HogwartsEducation.dto.StudentDTO;
import com.hogwartseducation.HogwartsEducation.models.Student;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {
    StudentDTO toStudentDTO(Student student);
}
