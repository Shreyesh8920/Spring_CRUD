package com.school.crudDemo.DTO.Response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentCreateResponse {
    private Long id;

    private String name;

    private String message;
}
