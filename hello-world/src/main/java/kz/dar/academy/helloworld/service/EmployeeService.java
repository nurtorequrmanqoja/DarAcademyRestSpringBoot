package kz.dar.academy.helloworld.service;

import kz.dar.academy.helloworld.EmployeeModel;

import java.util.List;

public interface EmployeeService {
    void createEmployee(EmployeeModel employeeModel);
    List<EmployeeModel> getAllEmployees();
    EmployeeModel getEmployeeById(String employeeId);
    void updateEmployeeById(String employeeId, EmployeeModel employeeModel);
    void deleateEmployeeById(String employeeId);
}
