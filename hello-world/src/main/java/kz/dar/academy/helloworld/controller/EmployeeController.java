package kz.dar.academy.helloworld.controller;

import kz.dar.academy.helloworld.EmployeeModel;
import kz.dar.academy.helloworld.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity <String> createEmployee(@Valid @RequestBody EmployeeModel employeeModel){
        employeeService.createEmployee(employeeModel);
        return new ResponseEntity<String>("Successfully created", HttpStatus.OK);
    }

    @GetMapping("/all")
    public List <EmployeeModel> getAllEmployess(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{employeeId}")
    public EmployeeModel getEmployeeById (@PathVariable String employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @PutMapping("/{employeeId}")
    public ResponseEntity <String> updateEmployeeById(@PathVariable String employeeId,
                                                      @Valid @RequestBody EmployeeModel employeeModel){
        employeeService.updateEmployeeById(employeeId, employeeModel);
        return new ResponseEntity<String>("Successfully updated", HttpStatus.OK);
    }

    @DeleteMapping("/{employeeId}")
    public ResponseEntity <String> deleteEmployeeById(@PathVariable String employeeId){
        employeeService.deleateEmployeeById(employeeId);
        return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
    }
}
