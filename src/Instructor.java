public class Instructor extends Human
{
    String courses;
	Double salary;
	
	public Instructor(String name, String age, String city, String courses , Double salary){
		super(name,age,city);
		this.courses = courses;
		this.salary = salary;
	}
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	public void setAge(String newAge){
		age = newAge;
	}
	
	public String getAge(){
		return age;
	}
	
	public void setCity(String newCity){
		city = newCity;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setCourses(String newCourses){
		courses = newCourses;
	}
	
	public String getCourses(){
		return courses;
	}
	
	public void setSalary(Double newSalary){
		salary = newSalary;
	}
	
	public Double getSalary(){
		return salary;
	}
	
	@Override
	public String toString(){
	    String S_salary = String.valueOf(salary);
	    return name + " " + age + " " + city + " " + courses + " " + salary;
	}
}	   
