package in.bushansirgur.springbootcrud.springbootcrudapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_company")
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String companyOpeningDate;
	@Column
	private int employeeCount;
	@Column
	private String employees;
	@Column
	private String department;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompanyOpeningDate() {
		return companyOpeningDate;
	}

	public void setCompanyOpeningDate(String companyOpeningDate) {
		this.companyOpeningDate = companyOpeningDate;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Employee [" +
				"id=" + id + ", " +
				"name=" + name + ", " +
				"opening date=" + companyOpeningDate + ", " +
				"employee count=" + employeeCount + ", " +
				"employees=" + employees + ", " +
				"department=" + department + ",]";
	}
	
}
