package com.hogwartseducation.HogwartsEducation.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentProgress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Email
    private String email;

    @Min(0)
    @Max(100)
    private double firstCourse;

    @Min(0)
    @Max(100)
    private double secondCourse;

    @Min(0)
    @Max(100)
    private double thirdCourse;

    @Min(0)
    @Max(100)
    private double fourthCourse;

    @Min(0)
    @Max(100)
    private double fifthCourse;

    @Min(0)
    @Max(100)
    private double sixthCourse;

    @Min(0)
    @Max(100)
    private double seventhCourse;

    @Transient
    private double allProgress;
}
