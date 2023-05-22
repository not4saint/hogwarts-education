package com.hogwartseducation.HogwartsEducation.controllers;


import com.hogwartseducation.HogwartsEducation.dto.StudentDTO;
import com.hogwartseducation.HogwartsEducation.dto.StudentProgressDTO;
import com.hogwartseducation.HogwartsEducation.facades.HousePageFacade;
import jakarta.validation.constraints.NotEmpty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hogwarts-education")
public class HousePageController {
    private final HousePageFacade housePageFacade;
    @GetMapping("/{house}")
    public List<StudentDTO> getAllStudentsInSelectedHouse(@PathVariable @NotEmpty String house) {
        return housePageFacade.convertAndFindStudentsInSelectedHouse(house);
    }

    @GetMapping("/course")
    public StudentProgressDTO getInfoAboutEducation() {
        return housePageFacade.convertAndFindStudentProgressByEmail();
    }
}
