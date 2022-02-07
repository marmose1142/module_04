package by.epam.module_four.task_three;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость(массив из пяти элементов),
 * Создайте массив из 10 элементов такого типа. Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки,
 * равные только 9 и 10. 
 */

public class Main {

	public static void main(String[] args) {
		Student[] students = { new Student("Ipatov", "Maksim", 10, new int[] { 9, 8, 7, 6, 5 }),
				new Student("Rabinovich", "Isaak", 10, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Yitzhak", "Yoav", 10, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Morozov", "Sava", 9, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Ivanov", "Ivan", 9, new int[] { 2, 2, 2, 2, 2 }),
				new Student("Petrov", "Ivan", 9, new int[] { 2, 2, 2, 2, 2 }),
				new Student("Sokolov", "Ivan", 8, new int[] { 2, 2, 2, 2, 2 }),
				new Student("Ge", "Nikolay", 8, new int[] { 10, 9, 9, 9, 9 }),
				new Student("van Gog", "Vinsent", 8, new int[] { 10, 2, 3, 4, 5 }),
				new Student("Romanova", "Violetta", 8, new int[] { 2, 3, 4, 5, 6 }) };

		searchExcellentStudents(students);
	}

	private static void searchExcellentStudents(Student[] students) {
		boolean b = false;

		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].getRating().length; j++) {
				if (students[i].getRating()[j] > 8) {
					b = true;
				} else {
					b = false;
					break;
				}
			}
			if (b == true) {
				System.out.println(students[i].getSurname() + ";" + students[i].getGroupNumber());
			}
		}
	}
}
