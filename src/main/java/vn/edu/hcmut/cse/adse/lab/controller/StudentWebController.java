package vn.edu.hcmut.cse.adse.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import vn.edu.hcmut.cse.adse.lab.service.StudentService;
import vn.edu.hcmut.cse.adse.lab.entity.*;
import java.util.*;
@Controller
@RequestMapping("/students")
public class StudentWebController {
    @Autowired
    private StudentService service;
    
    @GetMapping
    public String getAllStudents(@RequestParam(required = false) String keyword,Model model){
        List<Student> students;
        if (keyword!=null && !keyword.isEmpty()){
            students=service.getByName(keyword);
        }
        else{
            students=service.getAll();
        }
        model.addAttribute("dsSinhVien",students);
        return "students";
    }
    @GetMapping("/add")
    public String addStudentForm(Model model){
        model.addAttribute("student",new Student());
        return "add-student";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute Student student){
        service.saveStudent(student);
        return "redirect:/students";
    }
    @GetMapping("/{id}")
    public String getStudentById(@PathVariable Long id, Model model){
        Student student=service.getById(id);
        model.addAttribute("student", student);
        return "detail";
    }
    @GetMapping("/edit/{id}")
    public String editStudentForm(Model model, @PathVariable Long id){
        Student student= service.getById(id);
        model.addAttribute("student", student);
        return "add-student";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        service.deleteStudent(id);
        return "redirect:/students";
    }
}
