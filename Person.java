import java.time.LocalDate;

public class Person {
	private String name;
	private int balance;
	private String birthDate;
	private Gender gender;

	public Person(String name, int balance, Gender gender, String birthDate) {
		this.name = name;
		this.balance = balance;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public Person(Person person) {
		this.name = person.name;
		this.balance = person.balance;
		this.birthDate = person.birthDate;
		this.gender = person.gender;
	}

	public int getAge() {
		String[] s = birthDate.split("-");
		int personYear = Integer.parseInt(s[2]);
		LocalDate now = LocalDate.now();
		return now.getYear() - personYear;
	}
}

	enum Gender {
		Male, Female;
	}
