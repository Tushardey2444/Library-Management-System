package com.personal.librarymanagementsystem.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class AssociateCardStudentRequest {

    private Integer studentId;
    private Integer cardId;
}
