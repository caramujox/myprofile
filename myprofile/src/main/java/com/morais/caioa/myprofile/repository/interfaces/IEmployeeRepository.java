package com.morais.caioa.myprofile.repository.interfaces;

import com.morais.caioa.myprofile.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
