package poo;

public class testEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(8, "Peter", "Tan", 2500);
		System.out.println(e1);
		
		e1.setSalary(999);
		System.out.println(e1);
		
		System.out.println("Id is : " + e1.getId());
		System.out.println("FirstName is : " + e1.getFirstName());
		System.out.println("LastName is : " + e1.getLastName());
		System.out.println("Salary is : " + e1.getSalary());
		
		System.out.println("Name is : " + e1.getName());
		
		System.out.println("Annual salary : " + e1.getAnnualSalary());
		
		System.out.println(e1.raiseSalary(10));
		System.out.println(e1);
		

	}

}
