public class Student extends Human
{
	String id;
	Double courses_grades;
	
	public Student(String name,String age, String city, String id, Double courses_grades){
		super(name,age,city);
		this.id = id;
		this.courses_grades = courses_grades;
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
	public void setId(String newId){
		id = newId;
	}
	public String getId(){
		return id;
	}
	public void setCoursesGrades(Double new_courses_grades){
		courses_grades = new_courses_grades;
	}
	public Double getCoursesGrades(){
		return courses_grades;
	}
	@Override
	public String toString(){
	    String S_courses_grades = String.valueOf(courses_grades);
	    return name + " " + age + " " + city + " " + id + " " + S_courses_grades;
	}	
}
   

    
