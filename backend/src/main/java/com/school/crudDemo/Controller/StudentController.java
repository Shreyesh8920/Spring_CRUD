package com.school.crudDemo.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.crudDemo.DTO.Request.StudentCreateRequest;
import com.school.crudDemo.DTO.Request.StudentUpdateRequest;
import com.school.crudDemo.DTO.Response.StudentCreateResponse;
import com.school.crudDemo.DTO.Response.StudentDeleteResponse;
import com.school.crudDemo.DTO.Response.StudentReadResponse;
import com.school.crudDemo.DTO.Response.StudentUpdateResponse;
import com.school.crudDemo.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService ;
    
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
        
    }


    @PostMapping("/create")
    public ResponseEntity<StudentCreateResponse> createRequest(@RequestBody StudentCreateRequest request){
        StudentCreateResponse response = studentService.createStudent(request);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/read/{id}")
    public ResponseEntity<StudentReadResponse> readRequest(@PathVariable Long id){
        StudentReadResponse response = studentService.readStudent(id);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<StudentUpdateResponse> updateRequest(@PathVariable Long id, @RequestBody StudentUpdateRequest request){
        StudentUpdateResponse response = studentService.updateStudent(id,request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<StudentDeleteResponse> deleteRequest(@PathVariable Long id){
        StudentDeleteResponse response = studentService.deleteStudent(id);
        return ResponseEntity.ok(response);
    }

}
