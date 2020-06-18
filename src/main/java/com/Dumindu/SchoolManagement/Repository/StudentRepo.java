package com.Dumindu.SchoolManagement.Repository;

import com.Dumindu.SchoolManagement.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface StudentRepo extends JpaRepository<Student,Integer> {

}
