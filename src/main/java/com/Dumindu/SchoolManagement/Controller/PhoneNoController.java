package com.Dumindu.SchoolManagement.Controller;

import com.Dumindu.SchoolManagement.Model.Student;
import com.Dumindu.SchoolManagement.Repository.StudentRepo;
import com.Dumindu.SchoolManagement.Repository.coNoRepo;
import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PhoneNoController {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private coNoRepo coNoRepo;

    @PostMapping("/saveStu")
    public Student save(@RequestBody Student request){
        return studentRepo.save(request);
    }

    @GetMapping("getAll")
    public List<Student> getAll(){
        return studentRepo.findAll();
    }

    @GetMapping("findStudent/{SId}")
    public Optional<Student> getStudent(@PathVariable Integer SId){
        return studentRepo.findById(SId);
    }

    @DeleteMapping("deleteStudent/{SId}")
    public List<Student> deleteStudent(@PathVariable Integer SId){
        studentRepo.deleteById(SId);
        return studentRepo.findAll();
    }

    @PutMapping("updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }
//    public Optional<Student> (@PathVariable("SId") Integer SId, @RequestBody Student student) {
//        Optional<Student> Stu = studentRepo.findById(SId);
//        if (Stu.isPresent()) {
//            Student student1 =new Student();
//            student1.setfName(student.getfName());
//            studentRepo.save(student1);
//        }
//        return studentRepo.findAll();
//
//    }
}
