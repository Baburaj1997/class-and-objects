package javatrain;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	public Employee(int id,String firstname, String lastname,int salary) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
	}
	public int getid() {
		return id;
	}
	public String getfirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getname() {
		return firstname+lastname;
	}
	public int getsalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		return salary*=12;
	}
	public double raiseSalary(int salary) {
		double rsalary=0;
		rsalary=(double)salary*20/100;
		return rsalary+salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ "]";
	}
	
}
