package com.greatlearning.department;

public class Department {

	public static void main(String[] args) {

		AdminDepartment A = new AdminDepartment();
		System.out.println("Welcome to " + A.departmentName());
		System.out.println(A.getTodaysWork());
		System.out.println(A.getWorkDeadline());
		System.out.println(A.isTodayAHoliday() + "\n");

		HrDepartment Hr = new HrDepartment();

		System.out.println("Welcome to " + Hr.departmentName());
		System.out.println(Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());
		System.out.println(Hr.isTodayAHoliday() + "\n");

		TechDepartment Tech = new TechDepartment();
		System.out.println("Welcome to " + Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());
		System.out.println(Tech.isTodayAHoliday());

	}

}
