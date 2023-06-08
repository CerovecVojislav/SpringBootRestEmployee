package com.example.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;  
import java.util.ArrayList;
import java.util.List;


@RestController
public class EmployeeController {
	@Autowired
		Repository repo;
	public ArrayList<Employee> listEmployees= new ArrayList<Employee> ();
	
    @PostMapping("/post")
    public Employee Post(@RequestBody Employee NewGuy) {			
		
		listEmployees.add(NewGuy);
		
      return repo.save(NewGuy);
    }
	@GetMapping("/get")
	public List<Employee> Get() {
		
		return repo.findAll();
			
	}	
	@PutMapping("/put")
	public String Put(@RequestBody Employee NewGuy){
		repo.findById(NewGuy.id)
		.map(employee ->{employee.setId(NewGuy.getId());
						employee.setName(NewGuy.getName());
						employee.setMail(NewGuy.getMail());
						employee.setPhone(NewGuy.getPhone());
						repo.save(employee);
						return "Employee updated";});
		return "Put.";
	}
	@DeleteMapping("/delete/{id}")
	public void Delete(@PathVariable Long id){;
		repo.deleteById(id);
	}

}
