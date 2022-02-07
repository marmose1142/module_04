package by.epam.module_four.task_one;

/*Создайте класс Test1 c двумя переменными.Добавьте метод вывода на экран и метод изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
 * из этих двух переменных. */

public class Main {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.setX(24);
		test1.setY(15);
		test1.printXY();
		test1.sumXY(test1.getX(), test1.getY());
		test1.searchLargestNumber(test1.getX(), test1.getY());
	}

}
