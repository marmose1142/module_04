package by.epam.module_four.task_six;

/* Составьте описание класса для предоставления времени. Предусмотрите возможности установки времени и 
 * изменения его отдельных полей(час, минута,секунда). с проверкой допустимости вводимых значений.
 *  В случае недопустимых значений полей устанавливается в значении 0.
 *   Создать методы изменения времени на заданное количество часов, минут, секунд */

public class Main {

	public static void main(String[] args) {
		Time time = new Time(2, 24, 24);
		time.presentTime();
		time.setHour(24);
		time.presentTime();
		time.timeChange(18, 3, 15);
        time.presentTime();
	}

}
