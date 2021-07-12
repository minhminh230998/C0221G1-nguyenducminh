package com.example.model.repository.employee;

import com.example.model.entity.customer.Customer;
import com.example.model.entity.employee.Employee;
import com.sun.xml.bind.v2.schemagen.episode.Package;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {
    @Query(value="select * from employee where `name` like :name",nativeQuery=true)
    Page<Employee> findByNameContaining(@Param("name") String name, Pageable pageable);
    @Query(value="select * from employee join app_user on employee.user_id=app_user.user_id where app_user.user_name = name ",nativeQuery=true)
   Employee findByAppUser( String name);

}
