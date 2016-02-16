package spring.mvc;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	private int cid;
	@Size(min= 3, max =20 , message="Customer Name Must be between 3 to 20 characters long." )
	@Pattern(regexp ="^[a-zA-Z]+$", message = "Customer Name Must be Alphabetic")
	private String cname;
	@Pattern(regexp = "^[A-za-z0-9._%+-]+@[a-zA-z0-9.-]+\\.[A-Za-z]{2,4}$", message ="invalid email Format")
	private String email;
	@Pattern(regexp = "^\\d{10}$", message = "Mobile must be 20 digit number")
	private String mobile;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
