package com.hogwartseducation.HogwartsEducation.facades;

import com.hogwartseducation.HogwartsEducation.dto.AuthStudentDTO;
import com.hogwartseducation.HogwartsEducation.dto.TokenResponse;
import com.hogwartseducation.HogwartsEducation.exceptions.BadAuthenticationException;
import com.hogwartseducation.HogwartsEducation.utils.JwtTokenUtil;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthFacade {
    private final AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;


    public TokenResponse checkStudentAuthAndGetToken(AuthStudentDTO authStudentDTO, HttpServletResponse response) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(authStudentDTO.getEmail(),
                                                                                            authStudentDTO.getPassword());
        try {
            authenticationManager.authenticate(token);
        } catch (BadCredentialsException ex) {
            throw new BadAuthenticationException("wrong login or password(or both of them)");
        }
        return // TODO: 22.05.2023 вернуть токен
    }
}
