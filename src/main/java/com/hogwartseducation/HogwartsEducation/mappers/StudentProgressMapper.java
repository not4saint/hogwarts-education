package com.hogwartseducation.HogwartsEducation.mappers;


import com.hogwartseducation.HogwartsEducation.dto.StudentProgressDTO;
import com.hogwartseducation.HogwartsEducation.models.StudentProgress;
import org.mapstruct.Mapper;

@Mapper
public interface StudentProgressMapper {
    StudentProgressDTO toStudentProgressDTO(StudentProgress studentProgress);
}
