package map;

import java.util.HashMap;

public class TestStudentHashMap {
	
	public static void main(String[] args) {
		StudentPojo stu1 = new StudentPojo(1,"rahil","Kumar");
		StudentPojo stu2 = new StudentPojo(2,"sahil","bathla");
		StudentPojo stu3 = 	new StudentPojo(1,"rahil","Kumar");
		
		HashMap<StudentPojo,String> map=new HashMap<>(); 
		
		map.put(stu1, "A");
		map.put(stu2, "B");
		map.put(stu3, "C");
	
		
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		
		System.out.println("stu1==stu3 "+ (stu1==stu3));
		
		System.out.println("stu1==stu3 "+(stu2==stu3));
		
		System.out.println("stu1 equals stu3 "+stu1.equals(stu3));
		
		System.out.println("stu2 equals stu3 "+stu2.equals(stu3));
		
		
		System.out.println(map);
		
	}

}
