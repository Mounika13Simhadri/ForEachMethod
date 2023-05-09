package for_each_example;

import java.util.*;

public class ForEach {

	public static void main(String[] args) {
		List<Person> person=new ArrayList<Person>();
		person.add(new Person("ABC",15));
		person.add(new Person("XYZ",20));
		
		System.out.println("Name:Age");
		
		//using for loop
		for(Person p:person) {
			System.out.println(p.getName()+":"+p.getAge());	
		}
		
		//using forEach method
		person.forEach((p)->{
			System.out.println(p.getName()+":"+p.getAge());		
		});
		
		//using stream +forEach
		person.stream().forEach((p)->{
			System.out.println(p.getName()+":"+p.getAge());		
		});


	}

}
class Person{

	public String name;
	public int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
