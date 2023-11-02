package Lesson3Lab1;

public class Person {
	private String name;
	Person(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		if(aPerson instanceof Person) {
			Person person = (Person) aPerson;
			if(this.name ==person.name)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

	}

}
