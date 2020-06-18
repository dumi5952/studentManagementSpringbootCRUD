package com.Dumindu.SchoolManagement.Repository;

import com.Dumindu.SchoolManagement.Model.coNo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="http://localhost:4200")
public interface coNoRepo extends JpaRepository<coNo,Integer > {
}
