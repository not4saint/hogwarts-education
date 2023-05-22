package com.hogwartseducation.HogwartsEducation.controllers;

import com.hogwartseducation.HogwartsEducation.dto.AuthStudentDTO;
import com.hogwartseducation.HogwartsEducation.dto.TokenResponse;
import com.hogwartseducation.HogwartsEducation.facades.AuthFacade;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hogwarts-education")
public class AuthController {
    private final AuthFacade authFacade;
    private final HttpServletResponse response;
    @PostMapping("/login")
    public TokenResponse login(@RequestBody AuthStudentDTO authStudentDTO) {
        return authFacade.checkStudentAuthAndGetToken(authStudentDTO, response);
    }
}
