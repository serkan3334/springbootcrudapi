package in.bushansirgur.springbootcrud.springbootcrudapi.dao;

import in.bushansirgur.springbootcrud.springbootcrudapi.model.Company;

import java.util.List;

public interface CompanyDAO {
	
	List<Company> get();
	
	Company get(int id);
	
	void save(Company company);
	
	void delete(int id);
}
