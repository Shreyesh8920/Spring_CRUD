package com.school.crudDemo.DTO.Response;

import lombok.Data;

@Data
public class StudentReadResponse {
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String branch;
}
