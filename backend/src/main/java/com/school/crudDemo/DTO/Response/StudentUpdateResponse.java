package com.school.crudDemo.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentUpdateResponse {
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String branch;

    private String message;
}
