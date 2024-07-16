package logicalPrograms;

class Employee{
	public static Employee employee;
	
	public static Employee getInstance() {
		if(employee==null) {
			employee=new Employee();
		}
		return employee;
	}
}


public class SingletonClass {
	
	public static void main(String[] args) {
		Employee employee1 = Employee.getInstance();
		Employee employee2=Employee.getInstance();
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee1==employee2);
	}
	
	
	

}
