package exercise;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		
		dogList.add(new Dog("초코","토이푸들"));
		dogList.add(new Dog("인절미","골든리트리버"));
		dogList.add(new Dog("도지","시바견"));
		dogList.add(new Dog("백설기","포메라니안"));
		dogList.add(new Dog("해피","웰시코기"));
		
		for(int i=0; i<dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog.showDogInfo());
		}
	}
}
