package com.greatlearning.department;

public class HrDepartment extends SuperDepartment {

	String departmentName() {
		return "Hr Department";
	}

	String getTodaysWork() {
		return "Fill today's timesheet and mark your Attendance";
	}

	String getWorkDeadline() {
		return "Complete by EOD";
	}

	String doActivity() {
		return "team Lunch";
	}
}
