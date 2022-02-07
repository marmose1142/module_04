package by.epam.module_four.task_three;

public class Student {
	private String surname;
	private String initials;
	private int groupNumber;
	private int[] rating;

	public Student(String surname, String initials, int groupNumber, int[] rating) {
		this.surname = surname;
		this.initials = initials;
		this.groupNumber = groupNumber;
		this.rating = rating;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getRating() {
		return rating;
	}

	public void setRating(int[] rating) {
		this.rating = rating;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;

	}
}
