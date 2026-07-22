package com.school.crudDemo.DTO.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentUpdateRequest {


    @NotBlank(message = "First name is mandatory")
    @Size(min = 2, max = 30, message = "First name must be between 2 and 30 characters")
    @Pattern(regexp = "^[A-Za-z]+$", message = "First name must contain only letters")
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    @Size(min = 2, max = 30, message = "Last name must be between 2 and 30 characters")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Last name must contain only letters")
    private String lastName;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Phone is mandatory")
    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 digits")
    private String phone;

    @NotBlank(message = "Branch is mandatory")
    private String branch;
}
