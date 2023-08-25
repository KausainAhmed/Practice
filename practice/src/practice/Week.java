package practice;

public enum Week {
MONDAY(1),WEDNESDAY(3),SUNDAY(7);
	int day;

	private Week(int day) {
		this.day = day;
	}
	public int getDay() {
		return day;
	}
}
