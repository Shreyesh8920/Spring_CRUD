package com.school.crudDemo.Mapper;

import org.springframework.stereotype.Component;

import com.school.crudDemo.DTO.Request.StudentCreateRequest;
import com.school.crudDemo.DTO.Request.StudentUpdateRequest;
import com.school.crudDemo.DTO.Response.StudentCreateResponse;
import com.school.crudDemo.DTO.Response.StudentDeleteResponse;
import com.school.crudDemo.DTO.Response.StudentReadResponse;
import com.school.crudDemo.DTO.Response.StudentUpdateResponse;
import com.school.crudDemo.Entity.Student;
@Component
public class StudentMapper {


    public Student toStudent(StudentCreateRequest request){
        Student student = new Student();
        student.setId(request.getId());
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setPhone(request.getPhone());
        student.setBranch(request.getBranch());
        return student;
    }


    public Student toStudentUpdateRequest(StudentUpdateRequest request){
        Student student = new Student();
        student.setId(0L);
        student.setFirstName(request.getFirstName());
        student.setLastName(request.getLastName());
        student.setEmail(request.getEmail());
        student.setPhone(request.getPhone());
        student.setBranch(request.getBranch());
        return student;        

    }

    public StudentCreateResponse toCreateStudentResponse(Student student){
        StudentCreateResponse res = new StudentCreateResponse();
        res.setId(student.getId());
        res.setName(student.getFirstName()+" "+student.getLastName());
        res.setMessage("Student Created Successfully");
        return res;
    }

    public StudentReadResponse toStudentReadResponse(Student student){
        StudentReadResponse res = new StudentReadResponse();
        res.setId(student.getId());
        res.setName(student.getFirstName()+" "+student.getLastName());
        res.setEmail(student.getEmail());
        res.setPhone(student.getPhone());
        res.setBranch(student.getBranch());
        return res;
    }

    public StudentUpdateResponse toStudentForUpdate(Student student){
        StudentUpdateResponse res = new StudentUpdateResponse();
        res.setId(student.getId());
        res.setName(student.getFirstName()+" "+student.getLastName());
        res.setEmail(student.getEmail());
        res.setPhone(student.getPhone());
        res.setBranch(student.getBranch());
        res.setMessage("Student Updated Successfully");
        return res;
    }

    public StudentDeleteResponse toStudentDeleteResponse(Long id){
        StudentDeleteResponse res = new StudentDeleteResponse();
        res.setId(id);
        res.setMessage("Student Deleted Successfully");
        return res;
    }
}
