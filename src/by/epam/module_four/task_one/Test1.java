package by.epam.module_four.task_one;

import java.util.Objects;

public class Test1 {
	private int x;
	private int y;

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return this.y;
	}

	public void printXY() {
		System.out.println("x = " + x + " " + "y = " + y);
	}

	public void sumXY(int x, int y) {
		System.out.println(x + y);
	}

	public void searchLargestNumber(int x, int y) {
		if (x > y) {
			System.out.println(x);
		} else if (y > x) {
			System.out.println(y);
		} else {
			System.out.println("numbers are equal");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Test1 [x=" + x + ", y=" + y + "]";
	}

}
