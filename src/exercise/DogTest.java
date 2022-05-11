package exercise;

public class DogTest {

	public static void main(String[] args) {
		Dog[] doglist = new Dog[5];
		
		doglist[0] = new Dog("초코","토이푸들");
		doglist[1] = new Dog("인절미","골든리트리버");
		doglist[2] = new Dog("도지","시바견");
		doglist[3] = new Dog("백설기","포메라니안");
		doglist[4] = new Dog("해피","웰시코기");
		
		for(int i = 0; i< doglist.length; i++) {
			System.out.println(doglist[i].showDogInfo());
		}
		System.out.println("=====향상된 포문=====");
		
		for(Dog dog : doglist ) {
			System.out.println(dog.showDogInfo());
		}
	}

}
