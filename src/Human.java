public class Human
{
	public String name,age,city;
	
	public Human(String name, String age, String city){
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public void setCity(String newCity){
		city = newCity;
	}
	public String getCity(){
		return city;
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
	@Override
	public String toString(){
	    return name + " " + age + " " + city;
	}
}
