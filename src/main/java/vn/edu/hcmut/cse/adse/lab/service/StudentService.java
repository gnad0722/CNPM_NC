package vn.edu.hcmut.cse.adse.lab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.edu.hcmut.cse.adse.lab.repository.StudentRepository;
import vn.edu.hcmut.cse.adse.lab.entity.Student;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAll(){
        return repository.findAll();
    } 

    public Student getById(Long id){
        return repository.findById(id).orElse(null);
    }
    public List<Student> getByName(String name){
        return repository.findByNameContainingIgnoreCase(name);
    }
    public Student saveStudent(Student student){
        return repository.save(student);
    }
    public void deleteStudent(Long id){
        repository.deleteById(id);
    }
}
