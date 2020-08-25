package in.bushansirgur.springbootcrud.springbootcrudapi.controller;

import in.bushansirgur.springbootcrud.springbootcrudapi.model.Company;
import in.bushansirgur.springbootcrud.springbootcrudapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
		
	@RequestMapping(value = {"/company"})
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("companiesList");
		List<Company> list = companyService.get();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("/openCompanyView")
	public ModelAndView openCompanyAddView() {
		ModelAndView mav = new ModelAndView("companiesAdd");
		mav.addObject("company", new Company());
		return mav;
	}
	
	@RequestMapping("/saveCompany")
	public ModelAndView save(@ModelAttribute("company") Company companyObj) {
		ModelAndView mav = new ModelAndView("companiesList");
		companyService.save(companyObj);
		List<Company> list = companyService.get();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("/company/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("companiesAdd");
		Company companyObj = companyService.get(id);
		if(companyObj == null) {
			throw new RuntimeException("Company not found"+id);
		}
		mav.addObject("company", companyObj);
		return mav;
	}
	
	@RequestMapping("/deleteCompany/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("companiesList");
		companyService.delete(id);
		List<Company> list = companyService.get();
		mav.addObject("list", list);
		return mav;
	}
}
