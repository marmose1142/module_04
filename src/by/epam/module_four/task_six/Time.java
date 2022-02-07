package by.epam.module_four.task_six;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private int second;

	Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 1 & hour <= 24) {
			this.hour = hour;
		} else {
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute >= 0 & minute <= 59) {
			this.minute = minute;
		} else {
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 0 & second <= 59) {
			this.second = second;
		} else {
			this.second = 0;
		}
	}

	public void timeChange(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void presentTime() {
		System.out.println("present time : " + hour + " " + minute + " " + second);
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute, second);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute && second == other.second;
	}

}
