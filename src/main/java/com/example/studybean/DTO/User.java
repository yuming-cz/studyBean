package com.example.studybean.DTO;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;


@Repository
@Data
public class User {
    private Long id;
    private String userName;
    private String note ;
}

