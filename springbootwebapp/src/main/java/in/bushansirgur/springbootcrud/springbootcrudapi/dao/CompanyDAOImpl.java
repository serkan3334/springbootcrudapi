package in.bushansirgur.springbootcrud.springbootcrudapi.dao;

import in.bushansirgur.springbootcrud.springbootcrudapi.model.Company;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CompanyDAOImpl implements CompanyDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Company> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Company> query = currentSession.createQuery("from Company", Company.class);
		List<Company> list = query.getResultList();
		return list;
	}

	@Override
	public Company get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Company companyObj = currentSession.get(Company.class, id);
		return companyObj;
	}

	@Override
	public void save(Company company) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(company);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Company companyObj = currentSession.get(Company.class, id);
		currentSession.delete(companyObj);
	}

}
