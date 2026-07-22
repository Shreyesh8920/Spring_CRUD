package com.school.crudDemo.Service;



import com.school.crudDemo.DTO.Request.StudentCreateRequest;
import com.school.crudDemo.DTO.Request.StudentUpdateRequest;
import com.school.crudDemo.DTO.Response.StudentCreateResponse;
import com.school.crudDemo.DTO.Response.StudentDeleteResponse;
import com.school.crudDemo.DTO.Response.StudentReadResponse;
import com.school.crudDemo.DTO.Response.StudentUpdateResponse;
// import com.school.crudDemo.Entity.Student;


public interface StudentService {
    
    public StudentCreateResponse createStudent(StudentCreateRequest request);

    public StudentReadResponse readStudent(Long id);

    public StudentUpdateResponse updateStudent(Long id, StudentUpdateRequest request);

    public StudentDeleteResponse deleteStudent(Long id);


}
