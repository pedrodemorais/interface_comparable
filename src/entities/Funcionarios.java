package entities;

public  class Funcionarios implements Comparable<Funcionarios> {
	private String name;
	private Double salary;
	
	public Funcionarios() {
		
	}
	
	public Funcionarios(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getNome() {
		return name;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public Double getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Funcionarios other) {
		// TODO Auto-generated method stub
		return -salary.compareTo(other.getSalary());
	}

}
