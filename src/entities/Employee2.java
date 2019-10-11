package entities;

public class Employee2 {
	
	public int id;
	public String Name;
	public Double salary;
	
	public Employee2(int id, String name, Double salary) {
		super();
		this.id = id;
		Name = name;
		this.salary = salary;
	}
	
	public void IncreaseSalary(double percentage) {
		this.salary += salary * percentage / 100;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return id + ", " + Name + ", " + String.format("%.2f", salary) ;
	}
	
	
	

}
