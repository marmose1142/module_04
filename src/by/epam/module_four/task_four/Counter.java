package by.epam.module_four.task_four;

import java.util.Objects;

public class Counter {
	private int firstNumber;
	private int lastNumber;

	public Counter() {
		this.firstNumber = 1;
		this.lastNumber = 24;
	}

	public Counter(int firstNumber, int lastNumber) {
		this.firstNumber = firstNumber;
		this.lastNumber = lastNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getLastNumber() {
		return lastNumber;
	}

	public void setLastNumber(int lastNumber) {
		this.lastNumber = lastNumber;
	}

	public int increaseCounter() {
		return lastNumber++;
	}

	public int decreaseCounter() {
		return firstNumber--;
	}

	public void currentState() {
		System.out.println("counter = " + firstNumber + " - " + lastNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstNumber, lastNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		return firstNumber == other.firstNumber && lastNumber == other.lastNumber;
	}

}
