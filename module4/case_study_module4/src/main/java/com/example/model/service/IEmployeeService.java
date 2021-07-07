package com.example.model.service;

import com.example.model.entity.employee.Division;
import com.example.model.entity.employee.EducationDegree;
import com.example.model.entity.employee.Employee;
import com.example.model.entity.employee.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAllEmployee();

    Employee findByIdEmployee(Integer id);

    Page<Employee> findByNameEmployee(String name, Pageable pageable);

    void saveEmployee(Employee employee);
    void deleteEmployee(Integer id);
    List<Position> findAllPosition();
    Iterable<Division> findAllDivision();
    List<EducationDegree> findAllEducationDegree();
}
