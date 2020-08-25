package in.bushansirgur.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import in.bushansirgur.springbootcrud.springbootcrudapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO {
	
	List<Employee> get();

	Employee get(int id);
	
	void save(Employee employee);
	
	void delete(int id);
}
