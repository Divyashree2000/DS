package Details;

public class Employee {
	String name;
	int age;
	int salary;
	int id;
	public Employee(String name)
	{
		System.out.println("Employee name: "+name);
	}
	public void set(int EmpAge, int EmpSalary,int EmpId)
	{
		this.age=EmpAge;
		this.salary=EmpSalary;
		this.id=EmpId;
	}
	public void display()
	{
		System.out.println("Employee Age: "+age);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Id: "+id);
		
	}

	public static void main(String[] args) {
		Employee e=new Employee("Divya");
		e.set(21,30000,92211);
		e.display();
		Employee em=new Employee("Shree");
		e.set(21, 35000, 92212);
		e.display();
		
	}

}
