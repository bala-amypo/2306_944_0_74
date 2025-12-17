package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpsRespository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Student;
 @Repository
public interface StudentRepo extends JpsRespository<Student,Long>{
    
}