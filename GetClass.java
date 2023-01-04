package com.objectclass;

public class GetClass {

	public static void main(String[] args) {
		
		GetClass obj = new GetClass();
		
		System.out.println(obj.getClass().getName());
		
		System.out.println(obj.getClass().getTypeName());
		System.out.println(obj.getClass().getCanonicalName());
		System.out.println(obj.getClass().getSimpleName());

	}

}
