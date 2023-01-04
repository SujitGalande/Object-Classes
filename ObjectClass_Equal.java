package com.objectclass;

public class ObjectClass_Equal {
	
	int studentid;
	String name;
	public static void main(String[]args)
	{
		//  create an object01
		
		ObjectClass_Equal obj1 = new ObjectClass_Equal();
		obj1.studentid= 123;
		obj1.name = "Sujit";
		
		// create an object02
	
		ObjectClass_Equal obj2 = new ObjectClass_Equal();
		obj2.studentid = 123;
		obj2.name ="Sujit";
		System.out.println(obj1.equals(obj2));
}
}