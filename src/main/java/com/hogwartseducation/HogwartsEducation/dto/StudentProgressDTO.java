package com.hogwartseducation.HogwartsEducation.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class StudentProgressDTO {
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
}
