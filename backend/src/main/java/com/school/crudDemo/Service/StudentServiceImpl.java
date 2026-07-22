package com.school.crudDemo.Service;

import org.springframework.stereotype.Service;

import com.school.crudDemo.DTO.Request.StudentCreateRequest;
import com.school.crudDemo.DTO.Request.StudentUpdateRequest;
import com.school.crudDemo.DTO.Response.StudentCreateResponse;
import com.school.crudDemo.DTO.Response.StudentDeleteResponse;
import com.school.crudDemo.DTO.Response.StudentReadResponse;
import com.school.crudDemo.DTO.Response.StudentUpdateResponse;
import com.school.crudDemo.Entity.Student;
import com.school.crudDemo.Exception.StudentNotFoundException;
import com.school.crudDemo.Mapper.StudentMapper;
import com.school.crudDemo.Repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    //constructor
    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }
    //create student
    public StudentCreateResponse createStudent(StudentCreateRequest request){
        Student student = studentMapper.toStudent(request);
        studentRepository.save(student);
        return studentMapper.toCreateStudentResponse(student);
    }

    //update student
    public StudentUpdateResponse updateStudent(Long id,StudentUpdateRequest request){
        Student student = studentMapper.toStudentUpdateRequest(request);
        Student st = studentRepository.read(id);
        if(st==null){
            throw new StudentNotFoundException("Student with id " + id + " not found");
        }
        student.setId(id);
        studentRepository.save(student);
        return studentMapper.toStudentForUpdate(student);
    }

    //read student
    public StudentReadResponse readStudent(Long id){
        Student st = studentRepository.read(id);
        if(st==null){
            throw new StudentNotFoundException("Student with id " + id + " not found");
        }
        return studentMapper.toStudentReadResponse(st);
    }


    //delete student
    public StudentDeleteResponse deleteStudent(Long id){
        if(studentRepository.read(id)==null){
            throw new StudentNotFoundException("No Student Exists with Id: "+id);
        }
        studentRepository.delete(id);
        return studentMapper.toStudentDeleteResponse(id);
    }
}
