package in.bushansirgur.springbootcrud.springbootcrudapi.service;

import in.bushansirgur.springbootcrud.springbootcrudapi.dao.CompanyDAO;
import in.bushansirgur.springbootcrud.springbootcrudapi.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDAO companyDAO;
	
	@Transactional
	@Override
	public List<Company> get() {
		return companyDAO.get();
	}

	@Transactional
	@Override
	public Company get(int id) {
		return companyDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Company company) {
		companyDAO.save(company);
	}

	@Transactional
	@Override
	public void delete(int id) {
		companyDAO.delete(id);
	}

}
