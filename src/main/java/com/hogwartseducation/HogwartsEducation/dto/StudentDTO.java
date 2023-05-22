package com.hogwartseducation.HogwartsEducation.dto;

import com.hogwartseducation.HogwartsEducation.models.House;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class StudentDTO {
    private House house;
    @Min(1)
    @Max(7)
    private int courseNumber;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String middleName;
    @NotEmpty
    private String lastName;
}
