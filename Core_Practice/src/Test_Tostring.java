
 class Test {
	
	private String name;
	private int salary;
	private String designation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
	

}
public class Test_Tostring{
	
	public static void main(String[] arg) {
		Test t= new Test();
		
		t.setDesignation("Doctor");
		t.setName("Akshay");
		t.setSalary(2000000);
		System.out.println(t.toString());
	}
	
}
