package in.bushansirgur.springbootcrud.springbootcrudapi.controller;

import java.util.List;

import in.bushansirgur.springbootcrud.springbootcrudapi.model.Company;
import in.bushansirgur.springbootcrud.springbootcrudapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import in.bushansirgur.springbootcrud.springbootcrudapi.model.Employee;
import in.bushansirgur.springbootcrud.springbootcrudapi.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private CompanyService companyService;
		
	@RequestMapping(value = {"/employee"})
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("employeesList");
		List<Employee> list = employeeService.get();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("/openEmployeeView")
	public ModelAndView openEmployeeAddView() {
		ModelAndView mav = new ModelAndView("employeesAdd");
		mav.addObject("employee", new Employee());
		return mav;
	}
	
	@RequestMapping("/saveEmployee")
	public ModelAndView save(@ModelAttribute("employee") Employee employeeObj) {
		ModelAndView mav = new ModelAndView("employeesList");
		employeeService.save(employeeObj);
		List<Employee> listEmpl = employeeService.get();
		Company comp = new Company();

		int employeeCounter = 0;
		for (Employee le : listEmpl) {

			if(employeeObj.getCompanyInfo().equals(le.getCompanyInfo()))
				employeeCounter++;
		}
		List<Company> companyList = companyService.get();
		for (Company c : companyList) {
			if(c.getName().equals(employeeObj.getCompanyInfo())){
				//save employeeCounter to CompanyDB by ID
				c.setEmployeeCount(employeeCounter);
				companyService.save(c);
			}
		}
		mav.addObject("list", listEmpl);
		return mav;
	}
	
	@RequestMapping("/employee/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("employeesAdd");
		Employee employeeObj = employeeService.get(id);
		if(employeeObj == null) {
			throw new RuntimeException("Employee not found"+id);
		}
		mav.addObject("employee", employeeObj);
		return mav;
	}
	
	@RequestMapping("/deleteEmployee/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("employeesList");
		employeeService.delete(id);
		List<Employee> list = employeeService.get();
		mav.addObject("list", list);
		return mav;
	}
}
