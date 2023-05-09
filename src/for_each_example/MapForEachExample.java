package for_each_example;
import java.util.*;

public class MapForEachExample {

	public static void main(String[] args) {
		Map<Integer,Person> map=new HashMap<Integer,Person>();
		map.put(1,new Person("ABC",15));
		map.put(2,new Person("XYZ",25));
        
		
		System.out.println("Key:Name:Age");
		
		//using for loop
		for(Map.Entry<Integer, Person> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue().getName()+":"+entry.getValue().getAge());	
		}
		
		//using forEach method
		map.forEach((p,q)->{
			System.out.println(p+":"+q.getName()+":"+q.getAge());		
		});
		
		
	}

}
