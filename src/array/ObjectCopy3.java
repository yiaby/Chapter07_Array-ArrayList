package array;

public class ObjectCopy3 {
	//얕은 복사(shallow copy)
	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥","조정래");
		bookArray1[1] = new Book("데미안","헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가","유시민");
		
		//--->디폴트 생성자로 bookArray2 배열 인스턴스 생성
		bookArray2[0] = new Book();
		bookArray2[1] = new Book(); 
		bookArray2[2] = new Book();
		
		//bookArray1배열 요소를 bookArray2배열 인스턴스에 복사
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		for(int i = 0 ; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		//bookArray1배열의 첫번째 요소값 변경
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("===bookArray1===");
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("===bookArray2===");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
	
	}
	/*[출력]
		태백산맥,조정래
		데미안,헤르만 헤세
		어떻게 살 것인가,유시민
		===bookArray1===
		나목,박완서
		데미안,헤르만 헤세
		어떻게 살 것인가,유시민
		===bookArray2===
		태백산맥,조정래    	--->bookArray1 배열요소 값과 다른 내용이 출력됨
		데미안,헤르만 헤세
		어떻게 살 것인가,유시민

	 */

}
