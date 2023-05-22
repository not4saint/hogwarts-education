package com.hogwartseducation.HogwartsEducation;

import com.hogwartseducation.HogwartsEducation.mappers.StudentMapper;
import com.hogwartseducation.HogwartsEducation.mappers.StudentProgressMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HogwartsEducationApplication {

	public static void main(String[] args) {
		SpringApplication.run(HogwartsEducationApplication.class, args);
	}

	@Bean
	public StudentMapper getStudentMapper() {
		return Mappers.getMapper(StudentMapper.class);
	}

	@Bean
	public StudentProgressMapper getStudentProgressMapper() {
		return Mappers.getMapper(StudentProgressMapper.class);
	}

}
