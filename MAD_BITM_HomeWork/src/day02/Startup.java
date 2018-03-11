package day02;

import java.util.ArrayList;

public class Startup {
	
	public static void main(String[] args){
		
		
		PersonDetails person1 = new PersonDetails();
		
		person1.setFirstName("Fahad");
		person1.setMiddleName("Rahman");
		person1.setLastName("Uchchash");
		
		
		PersonDetails person2 = new PersonDetails();
		person2.setFirstName("Md.");
		person2.setMiddleName("Rasel");
		person2.setLastName("Rana");
		
		PersonDetails person3 = new PersonDetails();
		person3.setFirstName("Muhammad");
		person3.setMiddleName("Siddiqur");
		person3.setLastName("Rahman");
		
		
		
		ArrayList<PersonDetails> personList = new ArrayList<>();
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		for(PersonDetails persons : personList){
			
			System.out.println(persons.getFullName());
			
			
		}
			
		
	}
	
	
}
