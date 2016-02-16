package spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customers")
public class SpringMvcDemo {
	@Autowired
	public SimpleJdbcTemplate simpleJdbcTemplate;
	
	@RequestMapping(method = RequestMethod.GET,params = "new")
	public String createCustomerProfile(Model model)
	{
		model.addAttribute(new Customer());
		return "NewCustomerDetails";
		
	}
  
	@RequestMapping(method = RequestMethod.POST)
	public String insertCustomer(@Valid Customer customer ,BindingResult bindingresult)throws Exception
	{
		if(bindingresult.hasErrors())
		{
			return "NewCustomerDetails";
		}
		
		int cid = simpleJdbcTemplate.queryForInt("SELECT MAX(CID) FROM CUSTOMER");
		String cname = customer.getCname();
		String email = customer.getEmail();
		String mobile = customer.getMobile();
		cid++;
		
		simpleJdbcTemplate.getJdbcOperations().execute("INSERT INTO CUSTOMER VALUES(" + cid + ",'" + cname + "','"
				+ email + "','" + mobile + "')");
		customer.setCid(cid);
		return "Sucess";
		
	}
}
