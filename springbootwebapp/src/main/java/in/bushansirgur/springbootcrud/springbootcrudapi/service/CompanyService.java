package in.bushansirgur.springbootcrud.springbootcrudapi.service;

import in.bushansirgur.springbootcrud.springbootcrudapi.model.Company;

import java.util.List;

public interface CompanyService {
	List<Company> get();

	Company get(int id);
	
	void save(Company company);
	
	void delete(int id);
}
