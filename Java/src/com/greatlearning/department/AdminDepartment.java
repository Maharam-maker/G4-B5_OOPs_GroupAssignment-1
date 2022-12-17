package com.greatlearning.department;

public class AdminDepartment extends SuperDepartment {

	String departmentName() {
		return "Admin Department";
	}

	String getTodaysWork() {
		return "Complete your document Submission";
	}

	String getWorkDeadline() {
		return "Complete by EOD";
	}

}
