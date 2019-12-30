package ThemePark;

public enum AgeLimit {BABY(1),KID(12),Teen(16),Adult(18),SMALLKID(3);
	private int age;
	
	AgeLimit(int age) {
		this.age = age;
	}
	private int getAge() {
		return age;
	}
	public String toString() {
		return name() + "(" + age +")";
	}

}
