package by.epam.module_four.task_two;

/*Создайте класс Test2 c двумя переменными.Добавьте конструктор с входными параметрами.Добавьте конструктор, инициализируйте
 * члены класса по умолчанию.Добавтье set-и get- методы для полей экземпляра класса. */

public class Main {

	public static void main(String[] args) {
		Test2 test = new Test2();
		Test2 test2 = new Test2(5, 2);
		System.out.println(test);
		System.out.println(test2);
	}

}
