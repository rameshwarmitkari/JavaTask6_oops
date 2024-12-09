package Task_6;

public class Employee {

	private int id;
	private String name;
	private int salary;


	public void setId(int id) {
		this.id = id;
	}
	public int getid() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}

	public int raiseSalary(int percent) {
		salary=salary*12; // Annual salary calculation
		salary = salary + salary * percent /100;
		return salary;
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Zen class");
		emp.setSalary(1000);
		System.out.println("Emp id-> "+emp.getid()+"Emp name->"+emp.getName()+
				"Monthly salary-> "+emp.getSalary());

		System.out.println("Increased slary by percent-> "+emp.raiseSalary(10));

	}

}
