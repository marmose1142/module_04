package by.epam.module_four.task_four;

/* Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном
 * диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произовльными значениями. Счетчик имеет методы
 * увеличения и уменьшения состояния и методы позволяющие получить его текущее состояние.Написать код, демонстрирующий все
 * возможности класса. */

public class Main {

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter(24,35);
		
		counter1.currentState();
		counter2.currentState();
		
		counter1.decreaseCounter();
		counter1.currentState();
		
		counter2.increaseCounter();
		counter2.currentState();
        
	}

}
