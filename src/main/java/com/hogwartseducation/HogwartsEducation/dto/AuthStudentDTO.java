package com.hogwartseducation.HogwartsEducation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AuthStudentDTO {
    @Email
    private String email;
    @NotEmpty
    private String password;
}
