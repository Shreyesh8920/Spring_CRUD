package com.school.crudDemo.Repository;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.school.crudDemo.Entity.Student;
@Component
public class StudentRepository {
    private Map<Long,Student> db = new HashMap<>();

    public void save(Student student){
        db.put(student.getId(), student);
    }

    public Student read(Long id){
        return db.get(id);
    }

    public void delete(Long id){
        db.remove(id);
    }
    
}
