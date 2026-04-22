package Encapsulation;

public class users {
	 private int age;
	 private String name;
	
	// setting Age
	public void setAge(int a) {
		if(a>0) {
			this.age=a;
		}
		else {
			System.out.println("Inalid Input");
		}
	}
	
	// getting Age
	public int getAge() {
		return this.age;
	}
	
	// setting Name
	public void setName(String a) {
		this.name=a;
	}
	
	// getting Name
	public String getName() {
		return this.name;
	}
	
	

}
