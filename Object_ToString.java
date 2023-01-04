package com.objectclass;

public class Object_ToString {
	int f;

	@Override
	public String toString() {
		return "Object_ToString [f =" + f + "]";
	}

	public static void main(String[] args) {

		// create an object

		Object_ToString obj = new Object_ToString();
		obj.f = 64;
		System.out.println(" object value is>>>" + obj);

	}
}