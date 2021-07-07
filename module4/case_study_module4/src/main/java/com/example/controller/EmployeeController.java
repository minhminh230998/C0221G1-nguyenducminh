package com.example.controller;

import com.example.dto.employee.EmployeeDto;

import com.example.model.entity.employee.Employee;

import com.example.model.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping(value = "employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;

    @GetMapping(value = "/list")
    public String showListEmployee(Model model, @PageableDefault(size = 3) Pageable pageable,
                                   @RequestParam Optional<String> name) {

        String names="";
        if(name.isPresent()){
            names = name.get();
        }
        Page<Employee> employees = iEmployeeService.findByNameEmployee(names,pageable);
        model.addAttribute("employees", employees);
        model.addAttribute("names", names);
        return "/employee/list-employee";
    }

    @GetMapping(value = "/create")
    public String ShowFormCreateEmployee(Model model) {
        model.addAttribute("employeeDto", new EmployeeDto());
        model.addAttribute("positionList",iEmployeeService.findAllPosition());
        model.addAttribute("divisionList",iEmployeeService.findAllDivision());
        model.addAttribute("educationDegreeList",iEmployeeService.findAllEducationDegree());
        return "/employee/create-employee";
    }

    @PostMapping(value = "/create")
    public String createEmployee(@ModelAttribute @Valid EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("positionList",iEmployeeService.findAllPosition());
            model.addAttribute("divisionList",iEmployeeService.findAllDivision());
            model.addAttribute("educationDegreeList",iEmployeeService.findAllEducationDegree());
            return "/employee/create-employee";
        }
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        iEmployeeService.saveEmployee(employee);
        redirectAttributes.addFlashAttribute("message", "Update employee successfully!");
        return "redirect:/employee/list";
    }
    @GetMapping(value = "/update")
    public String showFormUpdateEmployee(@RequestParam Integer id, Model model){
        Employee employee=iEmployeeService.findByIdEmployee(id);
        EmployeeDto employeeDto=new EmployeeDto();
        BeanUtils.copyProperties(employee,employeeDto);
        model.addAttribute("employeeDto",employeeDto);
        model.addAttribute("positionList",iEmployeeService.findAllPosition());
        model.addAttribute("divisionList",iEmployeeService.findAllDivision());
        model.addAttribute("educationDegreeList",iEmployeeService.findAllEducationDegree());
        return "/employee/update-employee";
    }
    @PostMapping(value = "/update")
    public String updateEmployee(@ModelAttribute @Valid EmployeeDto employeeDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("positionList",iEmployeeService.findAllPosition());
            model.addAttribute("divisionList",iEmployeeService.findAllDivision());
            model.addAttribute("educationDegreeList",iEmployeeService.findAllEducationDegree());
            return "/employee/create-employee";
        }
        Employee employee=new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        iEmployeeService.saveEmployee(employee);
        redirectAttributes.addFlashAttribute("message", "Update employee successfully!");
        return "redirect:/employee/list";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam Integer id){
        iEmployeeService.deleteEmployee(id);
        return "redirect:/employee/list";
    }
}
