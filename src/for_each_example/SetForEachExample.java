package for_each_example;

import java.util.*;

public class SetForEachExample {

	public static void main(String[] args) {
		Set<Person> set=new HashSet<>();
		set.add(new Person("ABC",15));
		set.add(new Person("XYZ",20));
		
		System.out.println("Name:Age");
		
		//using for loop
		for(Person p:set) {
			System.out.println(p.getName()+":"+p.getAge());	
		}
		
		//using forEach+Lambda
		set.forEach((p)->{
			System.out.println(p.getName()+":"+p.getAge());		
		});
		
		//using stream +forEach
		set.stream().forEach((p)->{
			System.out.println(p.getName()+":"+p.getAge());		
		});

	}

}
