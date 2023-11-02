package Lesson3Lab1;

public class PersonWithJob {
	
	private double salary;
	private Person person;

	PersonWithJob(String name, double s) {
		this.person = new Person(name);
		salary = s;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		if(aPerson instanceof PersonWithJob) {
			PersonWithJob personWithJob = (PersonWithJob) aPerson;
			if(this.salary == personWithJob.salary && this.person.getName() == personWithJob.person.getName())
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		PersonWithJob p3 = new PersonWithJob("Joe", 30000);
		Person p4 = new Person("Joe");

		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		System.out.println("p1.equals(p3)? " + p1.equals(p3));
		System.out.println("p2.equals(p4)? " + p2.equals(p4));
	}


}
