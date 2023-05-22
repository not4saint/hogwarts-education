package com.hogwartseducation.HogwartsEducation.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil {
    @Value("${hogwarts.app.jwtSecret}")
    private String jwtSecret;
    @Value("${hogwarts.app.jwtAccessTokenExpirationMs}")
    private int jwtAccessTokenExpirationMs;
    @Value("${hogwarts.app.jwtRefreshTokenExpirationMs}")
    private int jwtRefreshTokenExpirationMs;


}
